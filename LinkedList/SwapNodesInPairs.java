package LinkedList;

//Given a linked list, swap every two adjacent nodes and return its head.
public class SwapNodesInPairs {

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        } 
    }

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

    public void swapNodes(Node head){
        if(head==null || head.next==null){
            return;
        }

        Node prev=head;
        Node curr=head.next;

        while(prev!=null && curr!=null){
            int temp=prev.data;
            prev.data=curr.data;
            curr.data=temp;
            if(curr.next==null){
                break;
            }
            curr=curr.next.next;
            prev=prev.next.next;
        }
    }

    public void display(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        SwapNodesInPairs p1=new SwapNodesInPairs();
        p1.insert(1);
        p1.insert(2);
        p1.insert(3);
        p1.insert(4);

        p1.display();//1->2->3->4->null
        p1.swapNodes(p1.head);
        p1.display();//2->1->4->3->null
        
    }
    
}
