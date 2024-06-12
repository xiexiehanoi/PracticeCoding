package June.Day_240612;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution5 {
    static String word;
    static int len;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        word = br.readLine();
        len = word.length();
        LinkedList<String> list = new LinkedList<>();

        for(int i=2; i<len; i++){
            for(int j=1; j<i; j++){
                StringBuilder wrdSb1 = new StringBuilder(word.substring(0, j));
                StringBuilder wrdSb2 = new StringBuilder(word.substring(j, i));
                StringBuilder wrdSb3 = new StringBuilder(word.substring(i));
                String str1 = wrdSb1.reverse().toString();
                String str2 = wrdSb2.reverse().toString();
                String str3 = wrdSb3.reverse().toString();
                list.add(str1+str2+str3);
            }
        }
        Collections.sort(list);
        bw.write(list.pop());
        bw.flush();
        bw.close();
        br.close();
    }
}
