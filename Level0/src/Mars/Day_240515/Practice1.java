package Mars.Day_240515;

import java.util.Arrays;

public class Practice1 {
    public static int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.replaceAll("[^0-9]", " ").split(" ");
        for(String s : str) {
            if(!s.equals("")){
                answer+=Integer.parseInt(s);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        int result = solution(my_string);
        System.out.println("result: "+result);
    }
}
