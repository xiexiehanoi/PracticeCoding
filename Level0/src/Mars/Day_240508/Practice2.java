package Mars.Day_240508;

public class Practice2 {
    public static String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i = str.length-1; i>=0; i--){
            answer+=str[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "jaron";
        String result = solution(my_string);
        System.out.println("result: "+result);
    }
}
