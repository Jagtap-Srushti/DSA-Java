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

    public boolean isCycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
public class LLCycleDetecting {
    public static void main(String[] args){
        LinkedList l1=new LinkedList();  //1->2->3->2
        l1.head=new Node(1);
        l1.head.next=new Node(2);
        l1.head.next.next=new Node(3);
        l1.head.next.next.next=l1.head.next;

        LinkedList l2=new LinkedList();//1->2->3->4
        l2.insert(1);
        l2.insert(2);
        l2.insert(3);
        l2.insert(4);

        if(l1.isCycle()){
            System.out.println("Cycle is present");
        }
        else{
            System.out.println("Cycyle is not present");
        }
    }
    
}
