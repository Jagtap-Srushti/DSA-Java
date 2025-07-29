package Queue;
import java.util.*;

public class DequeOperation {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);  //1
        deque.addFirst(2);  //2 1
        deque.addFirst(3);  //3 2 1
        deque.addLast(4);   //3 2 1 4
        deque.addLast(5);   //3 2 1 4 5
        System.out.println(deque);
        deque.removeFirst();  //2 1 4 5
        deque.removeLast();   //2 1 4
        System.out.println(deque);
        System.out.println(deque.getFirst());  //2
        System.out.println(deque.getLast());   //4

        
    }
    
}
