package Mars.Day_240526;

public class Practice2 {
    public int solution(int chicken) {
        int answer = 0;
        while (chicken >= 10) {
            answer += chicken / 10;
            chicken = (chicken / 10) + (chicken % 10);
        }
        return answer;
    }

    public static void main(String[] args) {
        int chicken = 1081;
        int result = new Practice2().solution(chicken);
        System.out.println("result = " + result);
    }
}
