package April.Day_240418;

public class Practice4 {
    public static int solution(int n) {
        int a = (int)Math.ceil(n/7.0);
        return a;
    }

    public static void main(String[] args) {
        int n = 15;
        int result = solution(n);
        System.out.println("result: "+result);
    }
}
