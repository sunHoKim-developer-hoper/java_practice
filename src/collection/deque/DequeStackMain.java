package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

        // 꺼내지 않고 단순 조회만
        System.out.println("stack.peek() : " + deque.peek());
        Integer lastNum = deque.pop();
        System.out.println("LastNum : " + lastNum);
    }

}
