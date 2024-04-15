package April.Day_240401;
/*
정수가 담긴 리스트 num_list가 주어집니다.
num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class Practice2 {
    public static int solution(int[] num_list) {
        long startTime = System.nanoTime();
        int answer = 0;
        String even ="";
        String odd ="";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                even += num_list[i];
            }else{
                odd += num_list[i];
            }
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " nanoseconds");
        return answer=Integer.parseInt(even)+Integer.parseInt(odd);
    }

    public static void main(String[] args) {
        int[] num_list = {5, 7, 8, 3};
        int result = solution(num_list);
        System.out.println(result);
    }
}
