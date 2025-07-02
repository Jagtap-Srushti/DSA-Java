package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    } 
}

class LinkedList{
    Node head;

    public void insert(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }


    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

public class LLReverse {
    public static void main(String []args){
        LinkedList l1=new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);

        System.out.println("LinkedList before reversing:");
        l1.display();
        l1.reverse();
        System.out.println("LinkedList after reversing");
        l1.display();


    }
    
}
