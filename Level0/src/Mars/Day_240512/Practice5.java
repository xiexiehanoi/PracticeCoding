package Mars.Day_240512;

public class Practice5 {
    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder(my_string);
        for(int i = 0; i < answer.length(); i++){
            for(int j = i + 1; j < answer.length(); j++){
                if(answer.charAt(i) == answer.charAt(j)){
                    answer.deleteCharAt(j);
                }
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String my_string = "people";
        String result = solution(my_string);
        System.out.println("result - "+result);
    }
}
