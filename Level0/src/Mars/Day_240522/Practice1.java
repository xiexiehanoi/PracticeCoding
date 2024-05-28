package Mars.Day_240522;

public class Practice1 {
    public static int solution(int[] sides) {
        int answer = 0;
        double x = Math.sqrt(Math.max(sides[0],sides[1])-Math.min(sides[0],sides[1]));

        return answer;
    }

    public static void main(String[] args) {
        int[] sides = {1,2};
        int result = solution(sides);
        System.out.println("result = " + result);
    }
}
