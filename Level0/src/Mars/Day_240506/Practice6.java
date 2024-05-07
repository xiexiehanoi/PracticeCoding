package Mars.Day_240506;

public class Practice6 {
    public static int solution(String str1, String str2) {
        int answer = 2;
        String[] str1Slice = str1.split(String.valueOf(str2.length()));
        return answer;
    }

    public static void main(String[] args) {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        int result = solution(str1,str2);
        System.out.println("result: "+result);
    }
}
