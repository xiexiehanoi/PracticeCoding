package April.Day_240428;

public class Practice1 {
    public static int[] solution(String my_string) {
        char[] str = my_string.toCharArray();
        int[] answer = new int[52];
        for(int i=0; i<str.length;i++){
            if(Character.isUpperCase(str[i])){
                answer[str[i]-'A']++;
            }
            else{
                answer[str[i]-'a'+26]++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "Programmers";
        int[] result = solution(my_string);
        System.out.println("result: "+ result);
    }
}
