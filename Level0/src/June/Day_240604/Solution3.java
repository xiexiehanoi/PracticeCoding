package June.Day_240604;

import java.io.*;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int f = 0;
        int count = 0;

        int max = 4472;

        for(int i = 1; i <= max; i++) {
            if(n <= i * (i + 1) / 2) {
                f = i;
                count = n - (i - 1) * i / 2;
                break;
            }
        }

        if(f % 2 == 0)
        {
            sb.append(count).append("/").append(f - count + 1);
        }
        else {
            sb.append(f - count + 1).append("/").append(count);
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
