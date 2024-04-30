package April.Day_240427;

import java.util.List;

public class Practice1 {
    public static int solution(int[] box, int n) {
        int answer = 1;
        int cube = n*n*n;
        int[] newCube = new int[box.length];
        for(int i=0; i<box.length; i++){
            newCube[i]=(box[i]/n)*n;
            answer*=newCube[i];
        }
        answer/=cube;
        return answer;
    }
public static void main(String[] args) {
    int[] box = {10,8,6};
    int n = 3;
    int result = solution(box, n);
    System.out.println("result: "+result);
}
}
