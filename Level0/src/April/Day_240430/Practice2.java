package April.Day_240430;

public class Practice2 {
    public static String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        char[] str = cipher.toCharArray();
        for(int i=code-1; i<str.length; i=i+code){
            answer.append(str[i]);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String chipher = "pfqallllabwaoclk";
        int code = 2    ;
        String result = solution(chipher, code);
        System.out.println("result: " +result);
    }
}
