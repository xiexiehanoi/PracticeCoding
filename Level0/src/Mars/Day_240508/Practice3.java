package Mars.Day_240508;

public class Practice3 {
    public static int solution(int n) {
        int answer = 0;
        double num = Math.sqrt(n);
        if(n%num==0){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 144;
        int result = solution(n);
        System.out.println("result: "+result);
    }
}
