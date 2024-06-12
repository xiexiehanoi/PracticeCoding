package June.Day_240607;

import java.io.*;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for(int i=0; i<9; i++) {
            list.add(Integer.parseInt(br.readLine()));
            sum += list.get(i);
        }
        List<Integer> list2 = new ArrayList<>(list);
        int sub = sum - 100;
        boolean found = false;

        for(int i=0; i<8; i++){
            for(int j=1; j<9; j++){
                if(list.get(i)+list.get(j)==sub){
                    list2.remove(list.get(i));
                    list2.remove(list.get(j));
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        Collections.sort(list2);
        for (int num : list2) {
            System.out.println(num);
        }
        br.close();

    }
}
