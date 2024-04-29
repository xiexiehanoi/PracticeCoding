package April.Day_240426;

public class Practice3 {
    public static String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        for (int i = r; i < code.length(); i += q)
            sb.append(code.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        int q = 3;
        int r = 1;
        String code = "qjnwezgrpirldywt";
        String result = solution(q,r,code);
        System.out.println("result: "+result);
    }
}
