package April.Day_240416;

public class Practice2 {
    public static int solution(int n) {
        int answer = 0;
        //문자로 형 변환
        String str = String.valueOf(n);
        for(int i=0; i<str.length(); i++){
            answer += Integer.parseInt(str.substring(i, i+1));;
        }


        return answer;
    }

    public static void main(String[] args) {
        int n = 123;
        int result = solution(n);
        System.out.println("result: "+result);
    }
}
