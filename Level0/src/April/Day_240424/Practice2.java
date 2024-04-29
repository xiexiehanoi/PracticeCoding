package April.Day_240424;

public class Practice2 {
    public static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            String str = String.valueOf(my_string.charAt(i)).repeat(n);
            answer.append(str);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;
        String result = solution(my_string,n);
        System.out.println("result: "+result);
    }
}
