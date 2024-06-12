package June.Day_240608;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        bw.write(sum(start,end)+"\n");
        bw.close();
        br.close();

    }

    static int sum(int a, int b){
        List<Integer> list = new ArrayList<>();
        int sum=0;
        for(int i=1; i<=b; i++){
            for(int j=0; j<=i-1; j++){
                list.add(i);
//                System.out.println("list = " + list);
            }
        }
        int c=a-1;
        int d=b-1;
        for(int i=c; i<=d; i++){
            sum+=list.get(i);
        }
        return sum;
    }
}
