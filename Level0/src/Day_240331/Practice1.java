package Day_240331;

public class Practice1 {
    public static int solution(int a, int b, int c) {
        long startTime = System.nanoTime();
        int answer = 0;
        if(a != b && b != c && a != c) {
            answer = a + b + c;
        }
        else if(a == b && b == c && a == c) {
            answer =  (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(b, 3));
        }
        else {
            answer = (a + b + c) * (int)((Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime; // 실행 시간 계산

        System.out.println("Execution time: " + duration + " nanoseconds"); // 실행 시간 출력
        return answer;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;
        int result = solution(a,b,c);
        System.out.println(result);
    }
}
