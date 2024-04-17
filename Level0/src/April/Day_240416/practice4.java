package April.Day_240416;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice4 {
    public static int[] solution(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    public static void main(String[] args) {
        long n = 12345;
        int[] result = solution(n);
        System.out.println("result: "+ Arrays.stream(result).toArray());
    }
}
