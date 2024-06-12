import java.io.*;
import java.util.HashSet;

public class Solution2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            String reverse = new StringBuffer(word).reverse().toString();
            if (set.contains(reverse) || word.equals(reverse)) {
               bw.write(word.length() + " " + word.charAt(word.length() / 2));
            } else {
                set.add(word);
            }
        }
        bw.close();
        br.close();
    }
}