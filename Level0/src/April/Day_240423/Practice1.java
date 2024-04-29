package April.Day_240423;

public class Practice1 {
    public static int solution(int[] numbers) {
        int answer = 0;
        int sum =0;
        for(int i=0;i<numbers.length; i++){
            for(int j=0; j<10; j++) {
                if (numbers[i] == j) {
                   sum +=numbers[i];
                }
                answer = 45-sum;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,6,7,8,0};
        int result = solution(numbers);
        System.out.println("result: "+result);
    }
}
