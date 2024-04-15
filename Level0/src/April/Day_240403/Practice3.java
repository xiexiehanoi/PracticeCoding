package April.Day_240403;

import java.util.stream.IntStream;

public class Practice3 {
    public static int[] solution(int[] arr, int[][] queries) {
        long startTime = System.nanoTime();
        int[] answer = {};
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " nanoseconds");

        return IntStream.range(0, queries.length)
                .map(q -> IntStream.rangeClosed(queries[q][0], queries[q][1])
                        .map(i -> arr[i])
                        .filter(i -> i > queries[q][2])
                        .min().orElse(-1)
                ).toArray();
    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        int[] result = solution(arr, queries);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

