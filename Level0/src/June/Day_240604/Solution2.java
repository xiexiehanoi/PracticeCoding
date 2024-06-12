package June.Day_240604;

import java.io.*;
import java.util.StringTokenizer;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String ip = br.readLine();

        if(ip.contains("::")){
         ip = ip.replace("::", ":none:");
        }

        StringTokenizer st = new StringTokenizer(ip.toString(), ":");
        StringBuilder result = new StringBuilder();

        if(!ip.contains(":none:")){
            while (st.hasMoreTokens()) {
                String strToken = st.nextToken();
                StringBuilder sbToken = new StringBuilder(strToken);
                while (sbToken.length() < 4) {
                    sbToken.insert(0, "0");
                }
                result.append(sbToken).append(":");
            }
        }else{
            StringBuilder sb = new StringBuilder();
            while (st.hasMoreTokens()) {
                String strToken = st.nextToken();
                if (strToken.equals("none")) {
                    int strMiss = 8 - st.countTokens() - (sb.length() > 0 ? 1 : 0);
                    for (int i = 0; i < strMiss; i++) {
                        sb.append("0000:");
                    }
                } else {
                    StringBuilder sbToken = new StringBuilder(strToken);
                    while (sbToken.length() < 4) {
                        sbToken.insert(0, "0");
                    }
                    sb.append(sbToken).append(":");
                }
            }
            result.append(sb);
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        // Output the result
        bw.write(result.toString());

        bw.flush();
        bw.close();
        br.close();

    }
}
