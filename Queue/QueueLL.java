package Queue;

import java.util.Queue;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
    }
}

class queue{

    Node front=null;
    Node rear=null;

    public boolean isEmpty(){
        return front==null;
    }
    public void enqueue(int data){
        Node newNode=new Node(data);

        if(front==null){
            front=newNode;
            rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data=front.data;
        front=front.next;
        return data;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class QueueLL {
    public static void main(String[] args) {
        queue q=new queue();
        System.out.println("Queue:");
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();
        q.dequeue();
        System.out.println("Queue After deletion:");
        q.display();
        System.out.println("Element at peek is "+q.peek());
        
    }
    
}
