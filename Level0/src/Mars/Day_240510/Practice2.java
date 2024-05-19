package Mars.Day_240510;

public class Practice2 {
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")){
            int temp = numbers[numbers.length-1];
            for(int i = 0; i < numbers.length - 1; i++){
                answer[i + 1] = numbers[i];
            }
            answer[0] = temp;
        }
        if(direction.equals("left")){
            int temp = numbers[0];
            for(int i = 1; i < numbers.length; i++){
                answer[i - 1] = numbers[i];
            }
            answer[numbers.length - 1] = temp;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction = "left";
        int[] result = solution(numbers,direction);
        for(int num : result){
            System.out.println("result: "+num);
        }
    }
}
