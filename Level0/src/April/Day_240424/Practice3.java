package April.Day_240424;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        String str = "Hello World!";
        char[] charArr = str.toCharArray();
        for(char ch:charArr){
            System.out.print(String.valueOf(ch).repeat(4));
        }
    }
}
