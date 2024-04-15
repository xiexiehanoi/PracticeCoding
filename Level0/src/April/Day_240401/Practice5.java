package April.Day_240401;


import java.util.stream.IntStream;

public class Practice5 {
    public static int[] solution(int[] num_list) {
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " nanoseconds");
        return IntStream.iterate(0, i -> i + 1)
                .limit(num_list.length + 1)
                .map(i -> i == num_list.length ? (num_list[i - 1] > num_list[i - 2] ? num_list[i - 1] - num_list[i - 2] : 2 * num_list[i - 1]) : num_list[i])
                .toArray();
    }


    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int[] result = solution(num_list);
        for (int num : result) {
            System.out.print(num + " ");
        }
        }
    }
