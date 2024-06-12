package June.Day_240607;

import java.io.*;
import java.util.*;

public class Solution4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] year = new int[3];
        Map<Integer, String> team = new LinkedHashMap<>();
        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int solved = Integer.parseInt(st.nextToken());
            year[i] = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            team.put(solved,name);
        }

        //날짜의 앞부분만 추출해보기
        Arrays.sort(year);
        List<Map.Entry<Integer, String>> solveDesc = new ArrayList<>(team.entrySet());
        solveDesc.sort((entry1, entry2) -> entry2.getKey().compareTo(entry1.getKey()));
        StringBuilder enterYear = new StringBuilder();
        StringBuilder firstTeamName = new StringBuilder();
        for(int i=0; i<year.length; i++){
            enterYear.append(year[i]%100);
        }
        for (Map.Entry<Integer, String> name : solveDesc) {
            firstTeamName.append(name.getValue().charAt(0));
        }
        bw.write(enterYear.toString()+"\n");
        bw.write(firstTeamName+"");

        bw.flush();
        bw.close();
        br.close();

    }
}