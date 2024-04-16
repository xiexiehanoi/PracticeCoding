package April.Day_240416;

import java.util.Arrays;

public class Practice1 {
    public static int solution(int[] array) {
        int answer = 0;
        //오름 차순
        Arrays.sort(array);
        int length = array.length/2;
        answer = array[length];
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};
        int result = solution(array);
        System.out.println("result: "+result);
    }
}
