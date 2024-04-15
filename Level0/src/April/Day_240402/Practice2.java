package April.Day_240402;

public class Practice2 {
    public static int[] solution(int[] arr, int[][] queries) {
        long startTime = System.nanoTime();
        int[] answer = {};
        for (int k=0; k<queries.length; k++) {
            int i = queries[k][0];
            int j = queries[k][1];

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        answer = arr;

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
