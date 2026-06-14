package LinkedList;

public class MaximumTwinSumOfLinkedList {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;
    public void insert(int data){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n1;
    }

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
    public int pairSum(Node head){
        Node mid=findMid(head);

        Node prev=null;
        Node curr=mid;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;

        int maxSum=0;
        while(right!=null){
            int sum=left.data+right.data;
            maxSum=Math.max(maxSum,sum);
            left=left.next;
            right=right.next;
        }

        return maxSum;

    }
    public static void main(String[] args) {
        MaximumTwinSumOfLinkedList l1=new MaximumTwinSumOfLinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(1);
        l1.insert(4);
        l1.insert(9);
        l1.insert(1);

        //1+1, 2+9, 1+4

        System.out.println(l1.pairSum(l1.head));

    }
    
}
