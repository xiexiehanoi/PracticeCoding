package Mars.Day_240520;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static String[] solution(String my_str, int n) {
        List<String> str = new ArrayList<>();
        int len = my_str.length();
        for (int i = 0; i < len; i += n) {
            int end = Math.min(i + n, len);
            str.add(my_str.substring(i, end));
        }

        String[] answer = new String[str.size()];
        for(int i=0; i<str.size(); i++){
            answer[i] = str.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        String[] result = solution(my_str, n);
        for(String s : result)
        {
            System.out.println("s = " + s);
        }
    }
}
