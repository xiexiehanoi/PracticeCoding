package Mars.Day_240516;

public class Practice3 {
    public static int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        for(int n=i; n<=j; n++){
            str+=n+"";
        }
        String[] s = str.split("");
        for(String m: s){
            if(m.equals(Integer.toString(k)))
            answer++;

        }

        return answer;
    }

    public static void main(String[] args) {
        int i= 1;
        int j = 13;
        int k = 1;
        int result = solution(i,j,k);
        System.out.println("result: "+result);
    }
}
