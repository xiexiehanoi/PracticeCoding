package Day_240403;

import java.util.Arrays;

public class Practice1 {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        //두개의 분자의 합 구하기
        //분자
        int result_numer = (numer1 * denom2) + (numer2 * denom1);
        //분모
        int result_denom = denom1 * denom2;

        // 최대 공약수 계산
        int gcd = getGcd(result_numer, result_denom);

        // 기약분수로 변환
        int[] answer = new int[2];
        //분자
        answer[0] = result_numer / gcd;
        //분모
        answer[1] = result_denom / gcd;

        return answer;
    }

    // 최대 공약수를 구하는 메서드
    private static int  getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
        }


    public static void main(String[] args) {
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;
        int[] result = solution(numer1, denom1,numer2,denom2);
        System.out.println(Arrays.toString(result));
    }
}
