package June.Day_240605;

import java.util.Deque;
import java.util.LinkedList;

public class Solution3 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.offerFirst(1); // 덱 앞쪽에 1 추가
        deque.offerLast(2); // 덱 뒤쪽에 2 추가
        System.out.println(deque.peekFirst()); // 덱 앞쪽 요소 조회: 1
        System.out.println(deque.peekLast()); // 덱 뒤쪽 요소 조회: 2
        deque.pollFirst(); // 덱 앞쪽 요소 제거
        deque.pollLast(); // 덱 뒤쪽 요소 제거
    }
}
