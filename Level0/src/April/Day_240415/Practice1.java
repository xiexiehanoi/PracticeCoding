package April.Day_240415;

public class Practice1 {
    public static int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>=0; j--){
                int multi = i*j;
                if(n==multi){
                    answer += (i+j);
                }
            }
        }
        return answer/2;
    }

    public static void main(String[] args) {
    int n = 12;
    int result = solution(n);
        System.out.println("result: "+result);
    }
}
