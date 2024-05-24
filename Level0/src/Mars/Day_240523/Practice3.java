package Mars.Day_240523;

public class Practice3 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int xMax  = board[0]/2;
        int yMax = board[1]/2;
        int x=0, y=0;

        for(String i : keyinput){
            switch (i){
                case "up":
                    y++;
                    if(y>yMax){
                        y = yMax;
                    }
                    break;
                case "down":
                    y--;
                    if(y<-yMax){
                        y = -yMax;
                    }
                    break;
                case "left":
                    x--;
                    if(x<-xMax){
                        x = -xMax;
                    }
                    break;
                case "right":
                    x++;
                    if(x>xMax){
                        x = xMax;
                    }
                    break;
            }
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }

    public static void main(String[] args) {
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11,11};
        int[] result = new Practice3().solution(keyinput, board);
        for(int n : result){
            System.out.println("n = " + n);
        }
    }
}
