package Mars.Day_240506;

public class Practive5 {
    public static int solution(int n) {
        int answer = 0;
        String str1 = Integer.toString(n);
        String[] str2 = str1.split("");
        for(int i=0; i<str2.length; i++){
            answer += Integer.parseInt(str2[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 1234;
        int result = solution(n);
        System.out.println("result: "+result);
    }
}
