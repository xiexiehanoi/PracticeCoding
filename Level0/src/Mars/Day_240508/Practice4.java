package Mars.Day_240508;


public class Practice4 {
    public static String solution(String my_string, String letter) {
        String answer = my_string.replace(letter,"");
        return answer;
    }

    public static void main(String[] args) {
        String my_string ="BCBdbe";
        String letter = "B";
        String result = solution(my_string, letter);
        System.out.println("result: "+result);
    }
}
