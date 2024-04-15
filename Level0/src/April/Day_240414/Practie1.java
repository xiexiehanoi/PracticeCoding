package April.Day_240414;

import java.util.ArrayList;
import java.util.List;

public class Practie1 {
    public static int solution(String my_string, String is_suffix) {
        int answer = 0;
        List<String> string = new ArrayList<>();

        for(int i=0; i<my_string.length(); i++){
            String str = my_string.substring(i,my_string.length());
            string.add(str);
            if(string.get(i).equals(is_suffix)){
              answer =1;
              break;
            }else{
              answer =0;
                }
            }

        return answer;
    }

    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "ana";
        int result = solution(my_string, is_suffix);
        System.out.println("result: "+result);
    }
}
