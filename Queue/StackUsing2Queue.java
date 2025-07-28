package Queue;
import java.util.*;
public class StackUsing2Queue {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    public boolean isEmpty(){
        return q1.isEmpty();
    }
    public void push(int data){
        q2.add(data);

        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp;
        temp=q1;
        q1=q2;
        q2=temp;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        return q1.remove();
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return q1.peek();
    }
    public static void main(String[] args) {
        StackUsing2Queue st=new StackUsing2Queue();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

        
    }
}
