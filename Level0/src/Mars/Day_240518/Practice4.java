package Mars.Day_240518;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice4 {
    public static int[] solution(int n) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                arr.add(i);
            }
        }
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 12;
        int[] result = solution(n);
        System.out.println("result: "+ Arrays.toString(result));
    }
}
