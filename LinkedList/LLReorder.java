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

    public void reorder(){

        //find the mid of linkedlist
        Node  slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node mid=slow;


        //reverse second half of linkedlist
        Node prev=null;
        Node curr=mid.next;
        mid.next=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //arranges the linkedlist in zig-zag order

        Node LH=head;
        Node RH=prev;
        Node Lnext,Rnext;

        while(LH!=null && RH!=null){
            Lnext=LH.next;
            LH.next=RH;
            Rnext=RH.next;
            RH.next=Lnext;
            LH=Lnext;
            RH=Rnext;
        }
        
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

public class LLReorder {
    public static void main(String [] args){
        LinkedList l1=new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);
        l1.insert(6);
        l1.display();
        l1.reorder();//arranges LinkedList in zig-zag order
        l1.display();

    }
    
}
