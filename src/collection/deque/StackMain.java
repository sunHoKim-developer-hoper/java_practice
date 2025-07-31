package collection.deque;

import java.util.Stack;

public class StackMain {
    

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        //꺼내지 않고 단순 조회만
        System.out.println("stack.peek() : " + stack.peek());
        Integer lastNum = stack.pop();
        System.out.println("LastNum : " + lastNum);
    }
}
