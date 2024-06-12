package June.Day_240605;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // enqueue
        queue.add("첫 번째 문서");
        queue.add("두 번째 문서");
        queue.add("세 번째 문서");

        System.out.println("현재 큐: " + queue);

        // dequeue
        System.out.println("dequeue: " + queue.poll());
        System.out.println("dequeue: " + queue.poll());

        System.out.println("현재 큐: " + queue);
    }
}
