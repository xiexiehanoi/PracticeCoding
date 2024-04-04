import java.util.ArrayList;

public class Practice2 {
    public static ArrayList<Integer> solution(int l, int r) {
        long startTime = System.nanoTime();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[05]+")) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " nanoseconds");
        return list;
    }

    public static void main(String[] args) {
        int l = 5;
        int r = 555;
        ArrayList<Integer> result = solution(l, r);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}