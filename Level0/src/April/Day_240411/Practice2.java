package April.Day_240411;

public class Practice2 {
    public static String solution(String my_string, int n) {
        String answer = "";
        int num = my_string.length()-n;
        answer += my_string.substring(num);
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "He110W0r1d";
        int n = 5;
        String result = solution(my_string,n);
        System.out.println("result: "+result);
    }
}
