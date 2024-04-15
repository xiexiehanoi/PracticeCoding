package April.Day_240415;

public class Practice2 {
    public static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder(my_string);

        return answer.substring(0,n);
    }

    public static void main(String[] args) {
        String my_String = "ProgrammerS123";
        int n = 11;
        String result = solution(my_String,n);
        System.out.println("result: "+result);
    }
}
