package Day_240402;

import java.util.Arrays;

public class Practice3 {
    public static int[] solution(int[] arr, int[][] queries) {
        long startTime = System.nanoTime();
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

            int temp = answer[i];
            answer[i] = answer[j];
            answer[j] = temp;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " nanoseconds");
        return answer;
    }

    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4};
        int[][] queries = {{0,3}, {1,2},{1,4}};
        int[] result = solution(arr, queries);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
