package April.Day_240430;

public class Practice1 {
    public static int solution(int num) {
        int answer = 0;
        long n = num;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            answer++;
            if(answer>=500){
                answer = -1;
                break;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int num =626331;
        int result = solution(num);
        System.out.println("result: "+result);
    }
}
