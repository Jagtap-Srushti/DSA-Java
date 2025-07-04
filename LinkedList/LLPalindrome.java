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
        Node newNode =new Node(data);

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
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public boolean isPalindrome(){
        //if LL is empty or having one element then it is palindrome
        if(head==null || head.next==null){
            return true;
        }
        
        //find mid 
        Node mid=findMid(head);

        //reverse 2nd half of linkedList
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }


        Node left=head; //head of left
        Node right=prev; //head of right side
        
        //check if left half or right half are equal or not
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }
}
public class LLPalindrome {
    public static void main(String args[]){
        LinkedList l1=new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(2);
        l1.insert(1);

        if(l1.isPalindrome()){
            System.out.println("LinkedList is palindrome");
        }
        else{
            System.out.println("LinkedList is not palindrome");
        }


    }
}
