package Queue;

import java.util.*;
public class ReverseFirstKEle {
        public static void reverseFirstK(Queue<Integer> q,int k){
            Stack<Integer> s=new Stack<>();
            // Step 1: Push first k elements into the stack
            for(int i=0;i<k;i++){
                s.push(q.remove());
            }
             // Step 2: Enqueue elements from stack back to queue

            while(!s.empty()){
                q.add(s.pop());
            }
            // Step 3: Move the remaining elements to the back
            int size=q.size();
            for(int i=0;i<size-k;i++){
                q.add(q.remove());
            }
        }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverseFirstK(q, 3);
        
        for(int num:q){
            System.out.print(num+" ");
        }
        
    }
    
}
