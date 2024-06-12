package June.Day_240607;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Map<String, Integer> map = new HashMap<>();
        int test = Integer.parseInt(br.readLine());

        for(int i=0; i<test; i++){
            int n = Integer.parseInt(br.readLine());
            for(int j=0; j<n; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                int l = Integer.parseInt(st.nextToken());
                map.put(s,l);
            }
            String maxKey = null;
            int max = 0;

            for(Map.Entry<String, Integer> entry : map.entrySet()) {
                if(entry.getValue() > max) {
                    max = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            if (maxKey != null) {
                bw.write(maxKey + "\n");
            }
        }



        bw.flush();
        bw.close();
        br.close();
    }
}
