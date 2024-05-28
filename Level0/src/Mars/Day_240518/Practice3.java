package Mars.Day_240518;

import java.util.Arrays;

public class Practice3 {
    public static int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int i=0; i<array.length; i++){
            str+=array[i];
        }
        String[] str2 = str.split("");
        int cnt =0;
        for(int i=0; i<str2.length; i++){
            if(str2[i].equals("7")){
                cnt++;
            }
        }
        answer = cnt;
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {7,77,17};
        int result = solution(array);
        System.out.println("result: "+result);
    }
}
