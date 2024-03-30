package Day_240330;

import java.util.stream.IntStream;

/*
두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
 */
public class Practice2 {
    public static int solution(int a, int d, boolean[] included) {
        long startTime = System.nanoTime();
        long endTime = System.nanoTime(); // 종료 시간 기록
        long duration = endTime - startTime; // 실행 시간 계산

        System.out.println("Execution time: " + duration + " nanoseconds"); // 실행 시간 출력
        return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();
    }

    public static void main(String[] args) {
        int a =3;
        int d =4;
        boolean[] included={true, false, false, true, true};
        int result = solution(a,d,included);
        System.out.println(result);
    }
}
