package April.Day_240329;

public class Practice4 {
    public static String solution(String code) {
        long startTime = System.nanoTime();
        if (code.isEmpty())
            return "EMPTY";

        String answer = "";
        int mode = 0;

        for(int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if(code.charAt(i) != '1' && i % 2 == 0)
                    answer += code.charAt(i);
                else if (code.charAt(i) == '1')
                    mode = 1;
            } else {
                if(code.charAt(i) != '1' && i % 2 != 0)
                    answer += code.charAt(i);
                else if(code.charAt(i) == '1')
                    mode = 0;
            }
        }
        long endTime = System.nanoTime(); // 종료 시간 기록
        long duration = endTime - startTime; // 실행 시간 계산

        System.out.println("Execution time: " + duration + " nanoseconds"); // 실행 시간 출력
        return answer.isEmpty() ? "EMPTY" : answer;
    }

    public static void main(String[] args) {
        String code ="abc1abc1abc";
        String result = solution(code);
        System.out.println(result);
    }
}
