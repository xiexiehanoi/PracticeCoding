package April.Day_240418;

import java.util.Arrays;

public class Practice3 {
    public static double solution(int[] array) {
        return  Arrays.stream(array)
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        double result = solution(arr);
        System.out.println("result: "+result);
    }
}
