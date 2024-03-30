package Day_240330;
/*
두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
 */
public class Practice1 {
    public static int solution(int a, int d, boolean[] included) {
        long startTime = System.nanoTime();
        int answer = 0;
        int sum=0;
        for(int i=1; i<=included.length; i++){
            sum = a+(d*(i-1));
            if(included[i-1]==true){
                answer += sum;
            }

        }
        long endTime = System.nanoTime(); // 종료 시간 기록
        long duration = endTime - startTime; // 실행 시간 계산

        System.out.println("Execution time: " + duration + " nanoseconds"); // 실행 시간 출력
        return answer;
    }

    public static void main(String[] args) {
        int a =3;
        int d =4;
        boolean[] included={true, false, false, true, true};
        int result = solution(a,d,included);
        System.out.println(result);
    }
}
