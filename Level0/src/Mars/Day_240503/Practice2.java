package Mars.Day_240503;

import java.util.Arrays;

public class Practice2 {
    public static int[] solution(int start, int end_num) {
        int len = start-end_num+1;
        int[] answer = new int[len];
        for(int i=start; i>=end_num; i--){
            answer[start-i]=i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int start = 10;
        int end_num = 3;
        int[] result = solution(start,end_num);
        System.out.println("result: "+ Arrays.toString(result));
    }
}
