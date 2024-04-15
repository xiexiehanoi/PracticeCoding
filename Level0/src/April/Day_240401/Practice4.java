package April.Day_240401;

public class Practice4 {
    public static int[] solution(int[] num_list) {
        long startTime = System.nanoTime();
        int[] answer = new int[num_list.length+1];

        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }

        answer[num_list.length] = num_list[num_list.length-1] > num_list[num_list.length-2] ? num_list[num_list.length-1]-num_list[num_list.length-2]:num_list[num_list.length-1]*2;
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration + " nanoseconds");
        return answer;
    }


    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int[] result = solution(num_list);
        for (int num : result) {
            System.out.print(num + " ");
        }
        }
    }
