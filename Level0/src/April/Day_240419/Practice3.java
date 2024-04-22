package April.Day_240419;

public class Practice3 {
    public static boolean solution(int x) {
        boolean answer = true;
        String[] str = Integer.toString(x).split("");
        int sum = 0;
        for(int i=0; i<str.length; i++)
            sum += Integer.parseInt(String.valueOf(str[i]));
        if(x%sum==0){
            return answer;
        }else{
            return answer = false;
        }
    }

    public static void main(String[] args) {
        int x = 12;
        boolean result = solution(x);
        System.out.println("result: "+result);
    }
}
