package June.Day_240605;

import java.util.Deque;
import java.util.LinkedList;

public class Solution4 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // 데이터 넣기 (addLast, addFirst)
        deque.addLast("뒤쪽에서 첫 번째");
        deque.addFirst("앞쪽에서 첫 번째");
        deque.addLast("뒤쪽에서 두 번째");

        System.out.println("현재 덱: " + deque);

        // 데이터 빼기 (removeFirst, removeLast)
        System.out.println("removeFirst: " + deque.removeFirst());
        System.out.println("removeLast: " + deque.removeLast());

        System.out.println("현재 덱: " + deque);
    }
}
