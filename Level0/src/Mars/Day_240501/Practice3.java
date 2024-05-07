package Mars.Day_240501;

public class Practice3 {
    public static int solution(String my_string) {
        int answer = 0;
        for(char c : my_string.toCharArray()){
            if(Character.isDigit(c)) {
                answer += Character.getNumericValue(c);
            }
        }
        return answer;
        }


    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        int result = solution(my_string);
        System.out.println("result: "+result);
    }
}
