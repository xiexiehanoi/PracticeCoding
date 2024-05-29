package Mars.Day_240526;

public class Practice3 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            answer++;
            while(answer%3==0 || String.valueOf(answer).contains("3")){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 40;
        int result = new Practice3().solution(n);
        System.out.println("result = " + result);
    }
}
