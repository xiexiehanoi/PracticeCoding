package Day_240329;

public class Practice6 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("첫번째, ").append("두전째, ").append("세번째, ").append("네번째, ").append("다섯번째");
//        String str = stringBuilder;   // String에 StringBuilder를 그대로 넣을 순 없다. toString()을 붙여야 한다
        String str = stringBuilder.toString();
        long endTime = System.nanoTime(); // 종료 시간 기록
        long duration = endTime - startTime; // 실행 시간 계산
        // 두 println()은 같은 값을 출력한다
//        System.out.println(stringBuilder);
        System.out.println(str);
        System.out.println("Execution time: " + duration + " nanoseconds"); // 실행 시간 출력
    }
}
