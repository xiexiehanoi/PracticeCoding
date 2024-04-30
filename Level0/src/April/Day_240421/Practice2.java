package April.Day_240421;

public class Practice2 {
    public static String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i< seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        String result = solution(seoul);
        System.out.println("result: "+result);
    }
}
