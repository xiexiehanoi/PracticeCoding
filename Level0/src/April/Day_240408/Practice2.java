package April.Day_240408;

public class Practice2 {
    public static int solution(int a, int b, int c, int d) {
        int answer = 0;
        if (a == b && b == c && c == d) {
            answer = 1111 * a;
        } else if (a == b && b == c) {
            answer = (10 * a + d) * (10 * a + d);
        } else if (a == c && c == d) {
            answer = (10 * a + b) * (10 * a + b);
        } else if (a == b && b == d) {
            answer = (10 * a + c) * (10 * a + c);
        } else if (b == c && c == d) {
            answer = (10 * b + a) * (10 * b + a);
        } else if (a == b && c == d) {
            answer = (a + c) * Math.abs(a - c);
        } else if (a == c && b == d) {
            answer = (a + b) * Math.abs(a - b);
        } else if (a == d && b == c) {
            answer = (a + b) * Math.abs(a - b);
        } else if (a == b && c != d) {
            answer = c * d;
        } else if (a == c && b != d) {
            answer = b * d;
        } else if (a == d && b != c) {
            answer = b * c;
        } else if (b == c && a != d) {
            answer =  a * d;
        } else if (b == d && a != c) {
            answer =  a * c;
        } else if (c == d && a != b) {
            answer =  a * b;
        } else {
            answer =  Math.min(Math.min(a, b), Math.min(c, d));
        }
        return answer;
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int c = 3;
        int d = 6;
        int result = solution(a,b,c,d);
        System.out.println("result: "+result);
    }
}
