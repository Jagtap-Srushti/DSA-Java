package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class FindIntersection{
    public Node intersection(Node head1,Node head2){
        while(head2!=null){
            Node temp=head1;
            while(temp!=null){
                if(head2==temp){
                    return head2;
                }
                temp=temp.next;
            }
            head2=head2.next;
        }
        return null;
    }
}

public class intersectionOfNode {
    public static void main(String[] args){
        FindIntersection f1=new FindIntersection();

        Node common=new Node(5);
        common.next=new Node(8);

        Node head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node(4);
        head1.next.next.next=common;
        Node head2=new Node(2);
        head2.next=new Node(3);
        head2.next.next=common;

        Node intersectionNode=f1.intersection(head1, head2);

        if(intersectionNode==null){
            System.out.println("LinkedLists are not intersected");
        }
        else{
            System.out.println("LinkedLists intersect each other at Node "+intersectionNode.data);
        }
    }
    
}
