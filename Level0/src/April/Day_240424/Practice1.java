package April.Day_240424;

import java.util.Arrays;

public class Practice1 {
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0;
        for(int num:arr){
            if(num%divisor==0){
                cnt++;
            }
        }

        if (cnt == 0) {
            return new int[] {-1};
        }

        int i =0;
        if(cnt!=0){
            for(int num:arr){
                if(num%divisor==0){
                    answer[i]=num;
                    i++;
                }
            }
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,6};
        int divisor = 10;
        int[] result = solution(arr, divisor);
        System.out.println("result: "+result);
    }
}
