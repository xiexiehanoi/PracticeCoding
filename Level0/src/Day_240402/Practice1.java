package Day_240402;

public class Practice1 {
    public static String solution(int[] numLog) {
        long startTime = System.nanoTime();
        String answer = "";
        for(int i=0; i<numLog.length-1; i++)
        {
            switch (numLog[i+1] - numLog[i]){
                case 1:
                    answer += "w";
                    break;
                case -1:
                    answer += "s";
                    break;
                case 10:
                    answer += "d";
                    break;
                case -10:
                    answer += "a";
                    break;
                default:
                    break;
            }
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " nanoseconds");
        return answer;
    }

    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String result = solution(numLog);
        System.out.println(result);
    }
}
