package Mars.Day_240516;

public class Practice1 {
    public static int[][] solution(int[] num_list, int n) {
        int len=num_list.length/n;
        int[][] answer = new int[len][n];
        int k =0;
        for(int i=0;i<len;i++) {
            for(int j=0; j<n; j++){
                answer[i][j]=num_list[k++];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        int[][] result = solution(num_list, n);
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
