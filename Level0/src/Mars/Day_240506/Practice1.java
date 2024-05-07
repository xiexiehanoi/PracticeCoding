package Mars.Day_240506;

public class Practice1 {
    public static String solution(String my_string) {
        String answer = "";
        char[] str = my_string.toCharArray();
        for(int i=0; i<str.length; i++){
            if(Character.isUpperCase(str[i])){
                answer+= Character.toLowerCase(str[i]);
            }else{
                answer+= Character.toUpperCase(str[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "abCdEfghIJ";
        String result = solution(my_string);
        System.out.println("result: "+result);
    }
}
