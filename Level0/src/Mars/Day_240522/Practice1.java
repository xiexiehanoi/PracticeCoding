package Mars.Day_240522;

import java.util.Arrays;

public class Practice1 {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int min = sides[0];
        int max = sides[1];

        for(int i = max - min + 1 ; i <= max ; i++){
            answer++;
        }

        for(int i = max + 1 ; i < min + max ; i++){
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] sides = {11,7};
        Practice1 p = new Practice1();
        int result = p.solution(sides);
        System.out.println("result = " + result);
    }
}
