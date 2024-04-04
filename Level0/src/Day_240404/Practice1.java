package Day_240404;

import java.util.Arrays;

public class Practice1 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        for(int q=0; q<queries.length; q++){
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];
            for(int i=s; i<=e; i++){
                if(i%k==0 || i%k==k){
                    answer[i]+=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,4,3};
        int[][] queries = {{0,4,1},{0,3,2},{0,3,3}};
        int[] result = solution(arr, queries);
        for(int num: result){
            System.out.println(num+" ");
        }
    }
}
