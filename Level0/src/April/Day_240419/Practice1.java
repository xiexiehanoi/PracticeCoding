package April.Day_240419;

public class Practice1 {
    public static int solution(int n) {
        int answer = 0;
        int i =1;
        while(true)
        {
            if(6*i%n==0){
                answer = i;
                break;
            }
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = solution(n);
        System.out.println("result: " +result);
    }
}
