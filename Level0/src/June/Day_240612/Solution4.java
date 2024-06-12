package June.Day_240612;

import java.io.*;
import java.util.StringTokenizer;

public class Solution4 {
    static int t;
    static int d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            d = Integer.parseInt(br.readLine());
            int k =1;
            while(k+(k*k)<=d){
                k++;
            }
        bw.write(k-1+"\n");
        }

        bw.close();
        br.close();
    }
}
