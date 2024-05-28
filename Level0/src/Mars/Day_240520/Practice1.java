package Mars.Day_240520;


public class Practice1 {
    public static int solution(String s) {
        int answer = 0;
        String[] str = s.replaceAll(" "," ,").split(" ,");
        for(int i =0; i<str.length; i++){
            if(!str[i].equals("Z")){
                answer+=Integer.parseInt(str[i]);
            }else{
                int temp = Integer.parseInt(str[i-1]);
                answer-=temp;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "1 2 Z 3";
        int result = solution(s);
        System.out.println("result = " + result);
    }
}
