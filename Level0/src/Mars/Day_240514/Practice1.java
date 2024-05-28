package Mars.Day_240514;

public class Practice1 {
    public static String solution(String letter) {
        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."
                };
        String[] morserArr = letter.split(" ");
        StringBuilder answer = new StringBuilder();
        for(String arr : morserArr){
            for(int i = 0; i < morse.length; i++) {
                if(arr.equals(morse[i])){
                   answer.append(Character.toString(i+'a'));
                }
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String letter = ".--. -.-- - .... --- -.";
        String result = solution(letter);
        System.out.println("result : "+result);

    }
}
