package Mars.Day_240507;

public class Practice4 {
    public static int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length;j++){
                int num = numbers[i]*numbers[j];
                System.out.println(num);
                if(answer<num){
                    answer=num;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, -5};
        int result = solution(numbers);
        System.out.println("result: "+result);
    }
}
