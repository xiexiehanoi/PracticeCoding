package April.Day_240414;

public class Practie2 {
    public static int solution(String s) {
        int answer = 0;
        if(s.matches("-")){
            answer = Math.abs(Integer.parseInt(s))*-1;
        }else{
            answer = Integer.parseInt(s);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "-2345";
        int result = solution(s);
        System.out.println("result: "+result);
    }
}
