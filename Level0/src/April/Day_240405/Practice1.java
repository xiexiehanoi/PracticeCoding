package April.Day_240405;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static List<Integer> solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();
        for(int i =start_num; i<=end_num; i++){
            answer.add(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;
        List<Integer> result = solution(start_num, end_num);
        System.out.println(result);
    }
}
