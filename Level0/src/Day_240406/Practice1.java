package Day_240406;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static List<Integer> solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i =0;
        while(i<arr.length){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else{
                if(stk.get(stk.size()-1)<arr[i]){
                    stk.add(arr[i]);
                    i++;
                }else if(stk.get(stk.size()-1)>=arr[i]){
                    stk.remove(stk.size()-1);
                }
            }
        }
        return stk;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        List<Integer> result = solution(arr);
        System.out.println(result);
    }
}
