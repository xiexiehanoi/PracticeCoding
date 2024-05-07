package Mars.Day_240503;

public class Practice3 {
    public static int solution(int[] sides) {
        int answer = 0;
        for(int i =0; i<sides.length; i++){
            for(int j=0; j<sides.length-i-1;j++){
                if(sides[j]>sides[j+1]){
                    int temp = sides[j+1];
                    sides[j+1] = sides[j];
                    sides[j] = temp;
                }
            }
        }
        if(sides[2]<sides[0]+sides[1]){
            answer = 1;
        }else{
            answer =2;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] sides = {199,72,222};
        int result = solution(sides);
        System.out.println("result: "+result);
    }
}
