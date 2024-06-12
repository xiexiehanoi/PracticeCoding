package June.Day_240608;

import java.io.*;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String star = "*";
        String blank = " ";
        int i=0;
        while(n>0){
            bw.write(blank.repeat(i)+star.repeat(n)+"\n");
            i++;
            n--;
        }

        bw.close();
        br.close();
    }
}
