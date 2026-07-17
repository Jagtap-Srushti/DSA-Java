package LinkedList;

public class ReverseNodesInKGroup{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class LinkedList{
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

        public Node findKNode(Node head,int k){
            Node temp=head;
            while(temp!=null && k>1){
                temp=temp.next;
                k--;
            }
            return temp;
        }

        public void reverse(Node head){
            Node prev=null;
            Node curr=head;
            Node next;

            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
        }


        public Node reverseKGroup(Node head, int k){
            Node temp=head;
            Node prevNode=null;
            while(temp!=null){
                Node kthNode=findKNode(temp,k);
                if(kthNode==null){
                    if(prevNode!=null){
                        prevNode.next=temp;
                    }
                    break;
                }
                Node nextNode=kthNode.next;
                kthNode.next=null;
                reverse(temp);
                if(head==temp){
                    head=kthNode;
                }
                else{
                    prevNode.next=kthNode;
                }

                prevNode=temp;
                temp=nextNode;
            }
            return head;

        }
    }
    public static void main(String args[]){
        LinkedList l1=new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);
        l1.insert(6);
        l1.insert(7);
        l1.insert(8);
        l1.insert(9);
        l1.insert(10);

        Node result=l1.reverseKGroup(l1.head, 3);

        Node temp=result;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        //l1: 1->2->3->4->5->6->7->8->9->10->null
        //ans: 3->2->1->6->5->4->9->8->7->10->null
    }
}