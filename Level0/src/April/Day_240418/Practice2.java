package April.Day_240418;

public class Practice2 {
    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        return answer = sum/arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        double result = solution(arr);
        System.out.println("result: "+result);
    }
}
