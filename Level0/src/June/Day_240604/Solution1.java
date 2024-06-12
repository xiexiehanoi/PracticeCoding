package June.Day_240604;

import java.io.*;
import java.util.StringTokenizer;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int countSwitch = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] sw = new int[countSwitch];

        for(int i = 0; i <= countSwitch; i++) {
            sw[i] = Integer.parseInt(st.nextToken());
        }

        int studentCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < studentCount; i++) {
            st = new StringTokenizer(br.readLine());

            int student = Integer.parseInt(st.nextToken());
            int studentSwitch = Integer.parseInt(st.nextToken());

            if(student==1){

                for(int j=studentSwitch; j<=countSwitch; j+=studentSwitch) {
                    if (sw[j] == 1) {
                        sw[j] = 0;
                    } else {
                        sw[j] = 1;
                    }
                }
            }else{

                sw[studentSwitch] = 1 - sw[studentSwitch];

                int j = 1;
                while(studentSwitch-j > 0 && studentSwitch+j <= countSwitch){
                    if (sw[studentSwitch - j] == sw[studentSwitch + j]) {
                        sw[studentSwitch - j] = 1 - sw[studentSwitch - j];
                        sw[studentSwitch + j] = 1 - sw[studentSwitch + j];
                    } else {
                        break;
                    }
                    j++;
                  }
                }
            }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= countSwitch; i++) {
            if (i != 1 && (i - 1) % 20 == 0) {
                sb.append("\n");
            }
            sb.append(sw[i]).append(" ");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();

    }
}