package Mars.Day_240516;

import java.util.Arrays;

public class Practice2 {
    public static int solution(String before, String after) {
        char[] chBefore = before.toCharArray();
        char[] chAfter = after.toCharArray();
        Arrays.sort(chBefore);
        Arrays.sort(chAfter);

        return new String(chBefore).equals(new String(chAfter))?1:0;
    }

    public static void main(String[] args) {
        String before = "allpe";
        String after = "apple";
        int result = solution(before, after);
        System.out.println("result: "+result);
    }
}
