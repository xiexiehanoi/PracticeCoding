package Day_240328;
/*
양의 정수 n이 매개변수로 주어질 때,
n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
 */
public class Practice1 {
    public static int solution(int n) {
        long startTime = System.nanoTime();
        int answer = 0;
        if (n % 2 == 0) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += i * i;
                }
            }
        } else {
            for (int i = 0; i <= n; i++) {
                if (i % 2 != 0) {
                    answer += i;
                }
            }
        }
        long endTime = System.nanoTime(); // 종료 시간 기록
        long duration = endTime - startTime; // 실행 시간 계산

        System.out.println("Execution time: " + duration + " nanoseconds"); // 실행 시간 출력
        return answer;
    }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int n =10;
            int str2 = solution(n);
            System.out.println(str2);
        }
}
