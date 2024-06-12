package June.Day_240612;

import java.io.*;
import java.util.StringTokenizer;

public class Solution2 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine(), ":");
            int[] arr = new int[st.countTokens()];
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        // 시, 분, 초 비교 아니면 패스.
                        if (i == j || j == k || i == k) {
                            continue;
                        }
                        if (arr[i] > 0 && arr[i] < 13 && arr[j] < 60 && arr[k] < 60) {
                            cnt++;
                        }
                    }
                }
            }

            bw.write(cnt+"");
            bw.flush();
            bw.close();
            bw.close();
        }
}
