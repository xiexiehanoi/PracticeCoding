package June.Day_240608;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] player = new int[N][7];

        // 입력 받은 값 2차원 배열로 초기화
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 7; j++) {
                player[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 선수 중 가장 높은 점수 구하기
//        for (int i = 0; i < N; i++) {
//            int runScore = Math.max(player[i][0], player[i][1]);
//            int trickScore = 0;
//            int start = 2;
//            while (start < 6) {
//                int firstScore = input[i][start];
//                for (int j = start + 1; j < input[i].length; j++) {
//                    int secondScore = input[i][j];
//                    int curTrickScore = firstScore + secondScore;
//                    trickScore = Math.max(trickScore, curTrickScore);
//                }
//                start++;
//            }
//            maxNum = Math.max(maxNum, runScore + trickScore);
//        }
//
//        System.out.println(maxNum);
//
//
//        bw.write(Arrays.toString(runFirst)+" "+Arrays.toString(runSecond)+" ");
        bw.close();
        br.close();
    }
}
