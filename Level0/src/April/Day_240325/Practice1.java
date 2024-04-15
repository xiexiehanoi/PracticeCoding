package April.Day_240325;

public class Practice1 {

	//문자열 섞기
    public static String solution(String str1, String str2) {
        String answer = "";
        int leng = (str1.length()+str2.length());
        
        for (int i = 0; i < leng; i++) {
        	if(i<str1.length()) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        	}
        }

        return answer;
    }

    public static void main(String[] args) {
        String result = solution("aaaaa", "bbbbb");
        System.out.println(result);
    }
}
