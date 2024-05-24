package Mars.Day_240521;

public class Practice5 {
    public static int solution(int balls, int share) {
        long answer = 1;
        for (int i = balls; i > balls - share; i--) {
            answer *= i;
        }
        answer /= factorial(share);
        return (int)answer;
    }

    public static long factorial(int share) {
        if (share <= 0) {
            return 1;
        } else {
            return share * factorial(share - 1);
        }
    }

    public static void main(String[] args) {
        int balls = 30;
        int share = 24;
        int result = solution(balls,share);
        System.out.println("result = " + result);
    }
}
