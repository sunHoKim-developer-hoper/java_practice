package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println("queue : " + deque);
        //꺼내지 않고 조회만
        System.out.println("queue.peek() : " + deque.peek());

        //첫번째 값 꺼내기
        System.out.println("queue.poll() : " + deque.poll());
        System.out.println("queue : " + deque);
    }

}
