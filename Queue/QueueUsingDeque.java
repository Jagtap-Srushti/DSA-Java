package Queue;

import java.util.*;
public class QueueUsingDeque {
    Deque<Integer> deque=new LinkedList<>();

    public void add(int data){
        deque.addLast(data);
    }

    public int remove(){
        return deque.removeFirst();
    }

    public int peek(){
        return deque.getFirst();
    }

    public static void main(String[] args) {
        QueueUsingDeque d=new QueueUsingDeque();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);

        System.out.println("Peek elemnt is:"+d.peek());

        System.out.println(d.remove());
        System.out.println(d.remove());
        System.out.println(d.remove());
        System.out.println(d.remove());
        
    }
    
}
