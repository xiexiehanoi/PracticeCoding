package Mars.Day_240518;

public class Practice2 {
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(emergency[i]<=emergency[j]){
                    answer[i]+=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] emergency = {30, 10, 23, 6, 100};
        int[] result = solution(emergency);
        for(int n : result){
            System.out.println("result: "+n);
        }

    }
}
