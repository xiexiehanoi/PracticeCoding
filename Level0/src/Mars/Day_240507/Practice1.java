package Mars.Day_240507;

public class Practice1 {
    public static int solution(String str1, String str2) {
        return str1.contains(str2)?1:2;
    }

    public static void main(String[] args) {
        String str1="ab6CDE443fgh22iJKlmn1o";
        String str2 ="6CD";
        int result = solution(str1,str2);
        System.out.println("result: "+result);
    }
}
