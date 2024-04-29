package April.Day_240425;

public class Practice2 {
    public static int solution(int hp) {
        return (hp/5)+(hp%5/3)+(hp%5%3/1);
    }

    public static void main(String[] args) {
        int hp =24;
        int result = solution(hp);
        System.out.println("result: "+result);
    }
}
