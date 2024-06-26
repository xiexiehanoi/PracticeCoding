package Mars.Day_240501;

public class Practice2 {
    public static String solution(String my_string, int[] indices) {
        String answer = "";
        String[] tmp = my_string.split("");

        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }

        for (String x : tmp) {
            if (!x.isEmpty()) {
                answer += x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        String result = solution(my_string, indices);
        System.out.println("result: "+result);
    }
}
