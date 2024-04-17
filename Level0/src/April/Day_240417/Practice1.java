package April.Day_240417;


import java.util.*;

public class Practice1 {
    public static List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int i=0;
        while(i<=n)
        {
            if(!(i%2==0)){
                answer.add(i);
            }
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> result = solution(n);
        System.out.println("result: "+result);
    }
}
