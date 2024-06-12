package Mars.Day_240528;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Practice2 {
    public int[] solution(int[] num_list, int n) {

        return Arrays.copyOfRange(num_list, n-1,num_list.length);
    }

    public static void main(String[] args) {
        int[] num_list = {2,1,6};
        int n = 3;
        int[] result = new Practice2().solution(num_list,n);
        System.out.println("result = " + Arrays.toString(result));
    }
}
