package Mars.Day_240518;

import java.util.Arrays;

public class Practice {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] str = s.split("");

        Arrays.sort(str);
        for(int i=0; i<str.length; i++){
            int cnt = 0;
            for(int j=0; j<str.length; j++){
                if(str[i].equals(str[j])){
                    cnt++;
                }
            }
            if(cnt==1){
                answer.append(str[i]);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String s = "abcabcadc";
        String result = solution(s);
        System.out.println("result: "+result);
    }

}
