package Mars.Day_240512;

public class Practice1 {
    public static int solution(int num, int k) {
        int answer = 0;
        String[] str = Integer.toString(num).split("");
        for(int i=0; i<str.length; i++){
            if(str[i].equals(Integer.toString(k))){
                answer = i+1;
                break;
            }else{
                answer =-1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int num = 232443;
        int k= 4;
        int result = solution(num, k);
        System.out.println("result: "+result);
    }
}
