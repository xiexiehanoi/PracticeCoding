package June.Day_240606;

import java.io.*;
import java.util.PriorityQueue;

public class Solution4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (!minHeap.isEmpty()) {
                    bw.write(minHeap.poll());
                } else {
                    bw.write(0);
                }
            } else {
                minHeap.add(x);
            }
        }

            bw.close();
            br.close();
        }
    }
