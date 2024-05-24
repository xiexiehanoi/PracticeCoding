package Mars.Day_240523;

public class Practice2 {
    public int solution(int M, int N) {

        return (M-1)+M*(N-1);
    }

    public static void main(String[] args) {
        int M = 2;
        int N = 5;
        int result = new Practice2().solution(M, N);
        System.out.println("result = " + result);
    }
}
