package April.Day_240416;

import java.util.ArrayList;
import java.util.List;

public class practice3 {
    public static List<Integer> solution(long n) {
        String str = String.valueOf(n);
        List<Integer> answer = new ArrayList<>();
        for(int i=str.length()-1; i>=0; i--){
            answer.add(Integer.parseInt(String.valueOf(str.charAt(i))));
            System.out.println(answer);
        }
        //리비스가 안된다...
        //그럼 string으로 변환해야 하나?
        //다른 방법은 없는건가?

        return answer;
    }

    public static void main(String[] args) {
        long n = 12345;
        List<Integer> result = solution(n);
        System.out.println("result: "+result);
    }
}
