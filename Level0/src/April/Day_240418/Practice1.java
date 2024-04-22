package April.Day_240418;

public class Practice1 {
    public static long solution(long n) {
        long answer =0;
        for (long i = 1; i <= 50000000000000L; i++) {
            long x = i * i;
            if (x == n) {
                answer = (i + 1) * (i + 1);
                break;
            }else if(x>n){
                answer = -1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        long n = 3;
        long result = solution(n);
        System.out.println("result: "+result);
    }
}
