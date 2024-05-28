package Mars.Day_240520;

public class Practice1 {
    public static String solution(String bin1, String bin2) {
        String answer = "";
        int num1 = Integer.parseInt(bin1,2);
        int num2 = Integer.parseInt(bin2,2);
        int result = num1+num2;
        answer = Integer.toBinaryString(result);
        return answer;
    }

    public static void main(String[] args) {
        String bin1 = "10";
        String bin2 = "11";
        String result = solution(bin1, bin2);
        System.out.println("result = " + result);
    }
}
