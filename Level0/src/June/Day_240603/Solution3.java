package June.Day_240603;

import java.io.*;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] arr = new char[5][15];

        for(int i = 0; i< 5;i++)
        {
            String str = br.readLine();
            int len = str.length();
            for (int j = 0; j < len; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int length = arr[0].length;
        for(int j = 0; j<length;j++)
        {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] == 0) {
                    continue;
                }
                bw.write(String.valueOf(arr[i][j]));
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
