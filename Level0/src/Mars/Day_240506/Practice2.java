package Mars.Day_240506;

public class Practice2 {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                idx = i;
            }
        }
        answer[0] = max;
        answer[1] = idx;
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {9, 10, 11, 8};
        int[] result = solution(array);
        System.out.println("result: " + result[0] + " at index " + result[1]);
    }
}
