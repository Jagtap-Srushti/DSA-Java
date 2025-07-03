package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
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

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void deleteNodeFromEnd(int n){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        if(n==size){
            head=head.next;
            return ;
        }

        Node prev=head;
        for(int i=0;i<size-n-1;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
    }
}
public class deleteNthNodeEnd {
    public static void main(String []args){
        LinkedList l1=new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);
        System.out.println("LinkedList before deleting Node:");
        l1.display();
        l1.deleteNodeFromEnd(4);
        System.out.println("LinkedList after deleting Node:");
        l1.display();

    }
    
}
