package April.Day_240403;

public class Practice2 {
    public static int[] solution(int[] arr, int[][] queries) {
        long startTime = System.nanoTime();
        int[] answer = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];
            int min = Integer.MAX_VALUE;
            boolean isFound = false;

            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    isFound = true;
                    min = Math.min(min, arr[i]);
                }
            }

            if (isFound) {
                answer[q] = min;
            } else {
                answer[q] = -1;
            }
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " nanoseconds");
        return answer;
    }



    public static void main(String[] args) {
        int[] arr = {0,1,2,4,3};
        int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};
        int[] result = solution(arr, queries);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
