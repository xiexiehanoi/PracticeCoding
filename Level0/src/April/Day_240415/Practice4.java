package April.Day_240415;

public class Practice4 {
    public static String solution(String my_string, int s, int e) {
        StringBuffer answer = new StringBuffer(my_string);
        String subString = my_string.substring(s,e+1);
        StringBuffer reversedSubString = new StringBuffer(subString).reverse();
        answer.replace(s, e + 1, reversedSubString.toString());

        return answer.toString();
    }

    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e =12;
        String result = solution(my_string,s,e);
        System.out.println(result);
    }
}
