package April.Day_240422;

import java.util.Arrays;

public class Practice1 {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        int i =0;
        while(i<n)
        {
            answer[i] = (long)x+(long)x*i;
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int x = 2;
        int n =5;
        long[] result = solution(x,n);
        System.out.println(result);
    }
}
