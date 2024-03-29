package Day_240329;

public class Practice5 {
    public static String solution(String code) {
        long startTime = System.nanoTime();
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                answer.append(current);
            }
        }
        long endTime = System.nanoTime(); // 종료 시간 기록
        long duration = endTime - startTime; // 실행 시간 계산

        System.out.println("Execution time: " + duration + " nanoseconds"); // 실행 시간 출력
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }

    public static void main(String[] args) {
        String code ="abc1abc1abc";
        String result = solution(code);
        System.out.println(result);
    }
}
