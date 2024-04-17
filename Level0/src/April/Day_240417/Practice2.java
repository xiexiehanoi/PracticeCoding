package April.Day_240417;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice2 {
    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        while(i<=n)
        {
            if(!(i%2==0)){
                list.add(i);
            }
            i++;
        }

        int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] result = solution(n);
        System.out.println("result: "+Arrays.toString(result));

    }
}
