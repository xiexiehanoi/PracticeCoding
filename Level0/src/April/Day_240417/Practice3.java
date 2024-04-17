package April.Day_240417;

import java.util.Arrays;

public class Practice3 {
    public static long solution(long n) {
        char[] ch = String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder(new String(ch));
        sb.reverse();

        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        long n = 118372;
        long result = solution(n);
        System.out.println("result: "+result);
    }
}
