package Mars.Day_240531;

import java.io.*;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        bw.write((n*(n-1))/2+"\n");
        bw.write("2");
        bw.close();
        br.close();

    }
}
