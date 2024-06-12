package June.Day_240603;

import java.io.*;
import java.util.StringTokenizer;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[9][9];

        // 배열을 초기화
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                if (st.hasMoreTokens()) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }

        // 최대값을 찾는 로직
        int max = arr[0][0];
        int x = 1, y = 1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = Math.max(max, arr[i][j]);
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        bw.write(max + "\n");
        bw.write(x + " " + y + "\n");

        bw.close();
        br.close();
    }
}
