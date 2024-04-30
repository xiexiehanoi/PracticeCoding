package April.Day_240421;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Practice1 {
    public static int solution(int n) {
        int answer = 0;
        int x = 2;
        while(x<n){
            if(n%x==1){
                answer=x;
                break;
            }
            x++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n=12;
        int result = solution(n);
        System.out.println(result);
    }
}
