package April.Day_240415;

public class Practice3 {
    public static int solution(String my_string, String is_prefix) {
        int answer = 0;
        if(my_string.startsWith(is_prefix)){
            return answer = 1;
        }else{
            return answer=0;
        }
    }

    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix = "ban";
        int result = solution(my_string,is_prefix);
        System.out.println("reuslt: "+result);
    }
}
