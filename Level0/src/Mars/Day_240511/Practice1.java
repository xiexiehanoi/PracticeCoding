package Mars.Day_240511;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static int[] solution(int n) {
        List<Integer> array = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                array.add(i);
            }
        }
        int[] answer = new int[array.size()];
        for(int i=0; i<array.size(); i++){
            answer[i]=array.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int n =24;
        int[] result = solution(n);
        System.out.println("result: "+result);
    }
}
