package Stack;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Stack{
    Node top;

    public boolean isEmpty(){
        return  top==null;
    }

    public void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int poppedElement=top.data;
        top=top.next;
        return poppedElement;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return top.data;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args){
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Intial Stack:");
        st.display();
        st.pop();
        System.out.println("Stack after popped top");
        st.display();
        System.out.println("Peek element is:"+st.peek());

    }
    
}
