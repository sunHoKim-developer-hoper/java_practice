package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {
    
    public static void main(String[] args) {
        
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("queue : " + queue);
        //꺼내지 않고 조회만
        System.out.println("queus.peek() : " + queue.peek());

        //첫번째 값 꺼내기
        System.out.println("queue.poll() : " + queue.poll());
        System.out.println("queue : " + queue);
    }
}
