package Mars.Day_240503;

import java.util.Arrays;

public class Practice1 {
    public static String[] solution(String my_string) {
        String[] answer = my_string.split("\\s");;

        return answer;
    }

    public static void main(String[] args) {
        String my_string = "i love you";
        String[] result =solution(my_string);
        System.out.println("result: "+ Arrays.toString(result));
    }
}
