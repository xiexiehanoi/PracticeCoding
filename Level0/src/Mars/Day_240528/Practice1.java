package Mars.Day_240528;

public class Practice1 {
    public int solution(int a, int b) {
        int answer = 0;
        int c =b/gcd(b,a);
        while(c!=1){
            if(c%2==0){
                c/=2;
            }
            else if(c%5==0){
                c/=5;
            }else{
                return answer = 2;
            }
        }
        return answer=1;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }


    public static void main(String[] args) {
        int a = 12;
        int b = 21;
        int result = new Practice1().solution(a,b);
        System.out.println("result = " + result);
    }
}
