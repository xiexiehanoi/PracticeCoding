package Day_240329;

public class Practice3 {
    public static int solution(int a, int b, boolean flag) {
        return flag==true?a+b:a-b;
    }

    public static void main(String[] args) {
            int a= -4;
            int b=7;
            boolean flag = true;
            int result = solution(a,b,flag);
            System.out.println(result);
    }
}
