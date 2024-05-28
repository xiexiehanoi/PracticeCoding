package Mars.Day_240520;

public class Practice3 {
    public static int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(Character.isDigit(ch)){
                answer+= Character.getNumericValue(ch);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String my_string ="3 + 4";
        int result = solution(my_string);
        System.out.println("result = " + result);
    }
}
