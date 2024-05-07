package Mars.Day_240506;

import java.util.ArrayList;
import java.util.List;

public class Practice4 {
    public static int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<Integer>();
        for(int num : numlist){
            if(num%n==0){
                list.add(num);
            }
        }

        int[] answer = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 12;
        int[] numlist = {2, 100, 120, 600, 12, 12};
        int[] result = solution(n,numlist);
        for(int num:result){
            System.out.println(num);
        }
    }
}
