package Mars.Day_240501;

import java.util.Arrays;

public class Practice1 {
    public static String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        Arrays.sort(indices);

        for (int i = indices.length - 1; i >= 0; i--) {
            int n = indices[i];
            answer.deleteCharAt(n);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        String result = solution(my_string, indices);
        System.out.println("result: "+result);
    }
}
