package April.Day_240426;

public class Practice1 {
    public static String solution(String rsp) {
        char[] ch = rsp.toCharArray();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < ch.length; i++){
            if(ch[i]=='2'){
                answer.append('0');
            }
            if(ch[i]=='0'){
                answer.append('5');
            }
            if(ch[i]=='5'){
                answer.append('0');
            }
        }

        return answer.toString();

    }

    public static void main(String[] args) {
        String rsp ="2";
        String result = solution(rsp);
        System.out.println("result: "+result);
    }
}
