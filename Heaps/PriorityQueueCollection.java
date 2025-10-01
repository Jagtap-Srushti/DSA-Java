package Heaps;

import java.util.PriorityQueue;;

public class PriorityQueueCollection {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(5);
        pq.add(3);
        pq.add(1);
        pq.add(4);
        pq.add(2);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
        
    }
    
}
