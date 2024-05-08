package Mars.Day_240507;

public class Practice2 {
    public static int solution(int n, int t) {
        int answer = n;
        for(int i=0; i<t; i++){
            answer=n*(int)Math.pow(2,t);
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 7;
        int t = 15;
        int result = solution(n,t);
        System.out.println("result: "+result);
    }
}
