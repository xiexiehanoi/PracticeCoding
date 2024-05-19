package Mars.Day_240508;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice1 {
    public static int[] solution(String my_string) {
        List<Integer> arr = new ArrayList<>();
        char[] str = my_string.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (Character.isDigit(str[i])) {
                arr.add(Character.getNumericValue(str[i]));
            }
        }


        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "hi12392";
        int[] result = solution(my_string);
        for(int n : result){
            System.out.println("result: "+n);
        }
    }
}
