package June.Day_240607;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        List<Integer> soldTicket = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = st.countTokens();
        for(int i=0; i<len; i++){
            soldTicket.add(Integer.parseInt(st.nextToken(" ")));
        }
        Collections.sort(soldTicket);
        int ticket = 1;
        for(int i=0;i<soldTicket.size(); i++){
            if(soldTicket.get(i) == ticket){
                ticket++;
            }else{
                break;
            }
        }

        bw.write(ticket+"\n");
        bw.flush();
        bw.close();
        br.close();

    }
}
