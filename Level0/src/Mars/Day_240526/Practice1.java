package Mars.Day_240526;

public class Practice1 {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] avg = new int[score.length];
        for(int i = 0; i < score.length; i++){
            avg[i] = (score[i][0]+score[i][1])/2;
        }
        for(int i = 0; i<avg.length; i++){
            int idx =1;
            for(int j = 0; j<score.length; j++){
                if(avg[i]<avg[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        int [] result = new Practice1().solution(score);
        for (int i : result){
            System.out.println("i = " + i);
        }
    }
}
