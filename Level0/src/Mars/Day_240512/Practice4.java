package Mars.Day_240512;

public class Practice4 {
    public static int solution(int order) {
        int answer = 0;
        String[] str = Integer.toString(order).split("");
        for(String s: str){
            if(s.equals("3") || s.equals("6") || s.equals("9")){
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int order = 29423;
        int result = solution(order);
        System.out.println("result-"+result);
    }
}
