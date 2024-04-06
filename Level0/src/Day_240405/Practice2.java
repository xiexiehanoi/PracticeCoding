package Day_240405;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);
        while(n!=1){
            if(n%2==0){
                n /=2;
                answer.add(n);
            }else{
                n = 3*n+1;
                answer.add(n);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> result = solution(n);
        System.out.println(result);
    }
}
