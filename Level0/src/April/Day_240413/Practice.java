package April.Day_240413;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static List<String> solution(String my_string) {
        List<String> answer = new ArrayList<>();

        for(int i=0; i<my_string.length(); i++){
            String str = my_string.substring(i,my_string.length());
            answer.add(str);
        }
        Collections.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "banana";
        List<String> result = solution(my_string);
        for(String str : result){
            System.out.println("result: "+str);
        }

    }
}
