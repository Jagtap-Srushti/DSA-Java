package LinkedList;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

class DoublyLinkedList{
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
        newNode.prev=temp;
    }

    public void reverseDLL(){
        Node previ=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=previ;
            curr.prev=next;
            previ=curr;
            curr=next;
        }
        head=previ;
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
public class reverseDoublyLinkedList {
    public static void main(String[] args){
        DoublyLinkedList d1=new DoublyLinkedList();
        d1.insert(1);
        d1.insert(2);
        d1.insert(3);
        d1.insert(4);
        d1.insert(5);
        d1.display();
        d1.reverseDLL();
        d1.display();

    }
}
