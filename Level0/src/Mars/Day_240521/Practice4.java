package Mars.Day_240521;

import java.util.Arrays;

public class Practice4 {
    public static long solution(String numbers) {
        long answer = 0;
        String[] numStrings = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] numDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int i = 0; i < numStrings.length; i++) {
            numbers = numbers.replace(numStrings[i], numDigits[i]);
        }

        answer= Long.parseLong(numbers);
        return answer;
    }

    public static void main(String[] args) {
        String numbers= "ninefivesixsevenonetwo";
        long result = solution(numbers);
        System.out.println("result = " + result);
    }
}
