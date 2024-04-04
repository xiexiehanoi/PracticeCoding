package Day_240404;

import java.util.ArrayList;

public class Practice3 {
    public static int[] solution(int l, int r) {
        long startTime = System.nanoTime();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " nanoseconds");
        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int l = 5;
        int r = 555;
        int[] result = solution(l, r);
        for(int num: result)
        {
            System.out.println(num + " ");
        }
    }
}
