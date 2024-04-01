package Day_240401;

import java.util.ArrayList;
import java.util.List;/*
정수 리스트 num_list가 주어질 때,
마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여
return하도록 solution 함수를 완성해주세요.
 */
public class Practice3 {
    public static int[] solution(int[] num_list) {
        long startTime = System.nanoTime();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num_list.length; i++) {
            list.add(num_list[i]);
        }

        int last = num_list[num_list.length - 1];
        int prev = num_list[num_list.length - 2];

        if (last > prev) {
            list.add(last - prev);
        } else {
            list.add(last * 2);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " nanoseconds");
        return answer;
    }


    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int[] result = solution(num_list);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
