package June.Day_240605;

import java.util.Stack;

public class Solution1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // push
        stack.push("첫 번째 요소");
        stack.push("두 번째 요소");
        stack.push("세 번째 요소");

        System.out.println("현재 스택: " + stack);

        // pop
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());

        System.out.println("현재 스택: " + stack);
    }
}
