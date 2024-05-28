package Mars.Day_240508;

public class Practice5 {
    public static String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder(my_string);

        char temp = answer.charAt(num1);
        answer.setCharAt(num1, answer.charAt(num2));
        answer.setCharAt(num2, temp);

        return answer.toString();
    }

    public static void main(String[] args) {
        String my_string ="hello";
        int num1 =1;
        int num2 =2;
        String result = solution(my_string,num1,num2);
        System.out.println("result: "+result);
    }
}
