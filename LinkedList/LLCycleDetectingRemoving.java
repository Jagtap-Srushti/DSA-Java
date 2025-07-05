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

    public void removeCycle(){

        Node slow=head;
        Node fast=head;
        boolean cycle=false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }

        if(cycle==false){
            return;
        }

        slow=head;
        Node prev=null;

        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }

    public void checkCycle(){
            if(isCycle()){
                System.out.println("Cycle is present");
            }
            else{
                System.out.println("Cycle is not present");
            }
        }
    }
public class LLCycleDetectingRemoving {
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

        l1.checkCycle();

        l1.removeCycle();
        l1.checkCycle();

    }
    
}
