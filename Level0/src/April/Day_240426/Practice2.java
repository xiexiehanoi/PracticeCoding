package April.Day_240426;

public class Practice2 {
    public static String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        int len = code.length();
        for (int i = 0; i < len; i += q) {
            int end = Math.min(i+q,len);
            String temp = code.substring(i, end);
            if (temp.length() > r) {
                answer.append(temp.charAt(r));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        int q = 1;
        int r = 0;
        String code = "programmers";
        String result = solution(q,r,code);
        System.out.println("result: "+result);
    }
}
