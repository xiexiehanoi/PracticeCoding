package April.Day_240419;

public class Practice2 {
    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return GCD(num2, num1 % num2);
    }

    public int LCM(int num1, int num2) {
        return num1 * num2 / GCD(num1, num2);
    }

    public int solution(int n) {
        return LCM(n, 6) / 6;
    }

    public static void main(String[] args) {
        Practice2 practice = new Practice2();
        int n = 10;
        int result = practice.solution(n);
        System.out.println("result: " +result);
    }
}
