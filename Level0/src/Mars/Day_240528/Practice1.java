package Mars.Day_240528;

import java.util.Arrays;

public class Practice1 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        int i =0;
        while(i<n){
            answer[i] = num_list[i];
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 1;
        int[] result = new Practice1().solution(num_list, n);
        System.out.println("result = " + Arrays.toString(result));

    }
}
