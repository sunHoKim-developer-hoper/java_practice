package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        System.out.println(deque);

        System.out.println("deque First : " + deque.pollFirst());
        System.out.println("deque Last : " + deque.pollLast());
        System.out.println(deque);
    }

}
