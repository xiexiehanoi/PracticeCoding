package April.Day_240401;
/*
정수가 담긴 리스트 num_list가 주어질 때,
모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
 */
public class Practice1 {
    public static int solution(int[] num_list) {
        long startTime = System.nanoTime();
        int sum1 = 1;
        int sum2 = 0;
        for(int num : num_list){
            sum1 *= num;
            sum2 += num;
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " nanoseconds");
        return sum1<sum2*sum2?1:0;
    }

    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        int result = solution(num_list);
        System.out.println(result);
    }
}
