package April.Day_240422;

public class Practice3 {
    public static String solution(String my_string, int m, int c) {

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < my_string.length() / m; i++) {
            str.append(my_string.substring(m * i, (m * i) + m).substring(c - 1, c));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String my_string = "programmers";
        int m = 1;
        int c = 1;
        String result = solution(my_string, m, c);
        System.out.println(result);
    }
}
