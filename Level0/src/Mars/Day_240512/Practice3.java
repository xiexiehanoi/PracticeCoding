package Mars.Day_240512;

public class Practice3 {
    public static int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            int count = 0;
            for(int j=1; j<=n; j++){
                if(i%j==0){
                    count++;
                }
                if(count>2){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = solution(n);
        System.out.println("result: "+result);
    }
}
