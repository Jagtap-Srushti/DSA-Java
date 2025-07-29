package Queue;

import java.util.*;
public class StackUsingDeque {
    Deque<Integer> deque=new LinkedList<>();

    public void push(int data){
        deque.addLast(data);
    } 

    public int pop(){
        return deque.removeLast(); 
    }

    public int peek(){
        return deque.getLast();
    }
    public static void main(String[] args) {
        StackUsingDeque d=new StackUsingDeque();
        d.push(1);
        d.push(2);
        d.push(3);
        d.push(4);

        System.out.println("Peek element is:"+d.peek());

        System.out.println(d.pop());
        System.out.println(d.pop());
        System.out.println(d.pop());
        System.out.println(d.pop());
        
    }
    
}
