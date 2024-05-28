package Mars.Day_240510;

public class practice1 {
    public static String solution(int age) {
        String answer = "";
        char[] str = Integer.toString(age).toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= '0' && str[i] <= '9') {
                char str2 = (char) ('a' + str[i] - '0');
                answer += str2;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int age = 23;
        String result = solution(age);
        System.out.println("result: "+result);
    }
}
