package April.Day_240422;

public class Practice2 {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int i=0;
        while(i<absolutes.length)
        {
            if(signs[i]==false)
            {
                answer += absolutes[i]*(-1);
                i++;
            }else{
                answer += absolutes[i];
                i++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true, false, true};
        int result = solution(absolutes,signs);
        System.out.println(result);
    }
}
