package April.Day_240331;

public class Practice2 {
    public static int solution(int a, int b, int c) {
        long startTime = System.nanoTime();
        int answer = 1;

        int count = 1;
        if(a == b || a == c || b == c) {
            count++;
        }

        if(a == b && b == c) {
            count++;
        }

        for(int i = 1; i <= count; i++) {
            answer *= (pow(a,i)+pow(b,i)+pow(c,i));
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime; // 실행 시간 계산

        System.out.println("Execution time: " + duration + " nanoseconds"); // 실행 시간 출력
        return answer;
    }
    private static int pow(int a, int b) {
        if(b == 0) return 1;
        return a * pow(a, b-1);
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;
        int result = solution(a,b,c);
        System.out.println(result);
    }
}
