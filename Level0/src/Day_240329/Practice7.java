package Day_240329;

import java.util.ArrayList;

public class Practice7 {
    public static void main(String[] args) {
        long startTIme = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        list.add("첫 번째, ");
        list.add("두 번째, ");
        list.add("세 번째, ");
        list.add("네 번째, ");
        list.add("다섯 번째");
        for (int i = 0; i < list.size(); i++)
        {
            stringBuilder.append(list.get(i));
        }
        long endTime = System.nanoTime();
        long duration = endTime -startTIme;
        System.out.println(stringBuilder);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}
