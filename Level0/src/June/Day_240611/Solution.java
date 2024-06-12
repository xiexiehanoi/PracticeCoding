package June.Day_240611;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
    static ArrayList<Integer>[] graph;
    static Queue<Integer> queue;
    static int visited[] = new int[100001];
    static int cnt = 1;
    static int n;
    static int k;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n= Integer.parseInt(st.nextToken());
        k= Integer.parseInt(st.nextToken());

        int answer = bfs(n);
        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();

    }

    static int bfs(int m){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(m);
        int idx = m;
        int s = 0;
        visited[idx] = 1;
        while (queue.isEmpty() == false)
        {
            s = queue.remove();

            if (s == k)
            {
                return visited[s]-1;
            }

            if (s-1>=0 && visited[s-1] == 0)
            {
                visited[s-1] = visited[s]+1;
                queue.add(s-1);
            }
            if (s+1 <= 100000 && visited[s+1] == 0)
            {
                visited[s+1] = visited[s]+1;
                queue.add(s+1);
            }
            if (2*s <= 100000 && visited[2*s] == 0)
            {
                visited[2*s] = visited[s] + 1;
                queue.add(2*s);
            }
        }
        return -1;
    }
}
