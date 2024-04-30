package April.Day_240421;

public class Practice3 {
    public static String solution(String[] seoul) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i< seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer.append("김서방은 ").append(i).append("에 있다");
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        String result = solution(seoul);
        System.out.println("result: "+result);
    }
}
