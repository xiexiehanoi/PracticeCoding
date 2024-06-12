package June.Day_240605;

import java.io.*;
import java.util.Stack;

public class Solution6 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int h = Integer.parseInt(br.readLine());
        stack.push(h);

        for(int i = 1; i < N; i++) {
            h = Integer.parseInt(br.readLine());

            while(true) {
                if(!stack.isEmpty() && h >= stack.peek()) {
                    stack.pop();
                }else {
                    stack.push(h);
                    break;
                }
            }

        }

        bw.write(stack.size()+"");
        bw.close();
        br.close();
    }

}