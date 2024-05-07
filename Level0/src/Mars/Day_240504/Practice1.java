package Mars.Day_240504;

public class Practice1 {
    public static int solution(int[] arr, int idx) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= idx && arr[i] == 1) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0};
        int idx = 4;
        int result = solution(arr, idx);
        System.out.println("result: "+result);
    }
}
