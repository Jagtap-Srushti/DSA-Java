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

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid=findMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);

        return merge(newLeft,newRight);
    }

    public Node merge(Node head1,Node head2){
        Node dummy=new Node(-1);
        Node temp=dummy;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                temp=temp.next;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                temp=temp.next;
                head2=head2.next;
            }
        }

        while(head1!=null){
            temp.next=head1;
            temp=temp.next;
            head1=head1.next;

        }
        while(head2!=null){
            temp.next=head2;
            temp=temp.next;
            head2=head2.next;
        }

        return dummy.next;
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
public class LLMergeSort {
    public static void main(String[] args){
        LinkedList l1=new LinkedList();
        l1.insert(5);
        l1.insert(2);
        l1.insert(1);
        l1.insert(3);
        l1.insert(4);
        l1.display();
        l1.head=l1.mergeSort(l1.head);
        l1.display();

    }

}
