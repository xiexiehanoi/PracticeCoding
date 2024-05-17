package Mars.Day_240512;

import java.util.Arrays;

public class Practice2 {
    public static String solution(String my_string) {
        char[] ch = my_string.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])) {
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }

        Arrays.sort(ch);
        return new String(ch);
    }

    public static void main(String[] args) {
        String my_string = "Python";
        String result = solution(my_string);
        System.out.println("result: "+result);
    }
}
