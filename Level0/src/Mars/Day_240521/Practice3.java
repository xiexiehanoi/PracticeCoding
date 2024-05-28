package Mars.Day_240521;

public class Practice3 {
    public static int solution(int[] numbers, int k) {
        return numbers[2*(k-1)%numbers.length];
    }

    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6};
        int k = 2;
        int result = solution(number, k);
        System.out.println("result = " + result);
    }
}
