package Queue;

import java.util.*;
public class QueueUsing2stack {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    public boolean isEmpty(){
        return s1.isEmpty();
    }

    public void enqueue(int data){
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        s1.push(data);

        while(!s2.empty()){
            s1.push(s2.pop());
        }
    }

    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        return s1.pop();
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return s1.peek();
    }


    public static void main(String[] args) {
        QueueUsing2stack q=new QueueUsing2stack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        while(!q.isEmpty()){
            System.out.println(q.dequeue());
        }

        
    }
    
}
