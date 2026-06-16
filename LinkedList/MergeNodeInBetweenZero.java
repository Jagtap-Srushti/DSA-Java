package LinkedList;

/*You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.

For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.

Return the head of the modified linked list.
*/
public class MergeNodeInBetweenZero {
    public static class Node{
        int data;
        Node next=null;
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

        public Node mergeNode(Node head){
            Node dummy=new Node(0);
            Node tail=dummy;
            Node temp=head.next;
            int sum=0;
            while(temp!=null){
                if(temp.data!=0){
                    sum+=temp.data;
                }
                else{
                    tail.next=new Node(sum);
                    tail=tail.next;
                    sum=0;
                }
                temp=temp.next;
            }
            return dummy.next;
        }

        public void display(Node head){
            if(head==null){
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
        MergeNodeInBetweenZero l1=new MergeNodeInBetweenZero();
        l1.insert(0);
        l1.insert(3);
        l1.insert(1);
        l1.insert(0);
        l1.insert(4);
        l1.insert(5);
        l1.insert(2);
        l1.insert(0);

        l1.display(l1.head);//0->3->1->0->4->5->2->0->null
        Node result=l1.mergeNode(l1.head);
        l1.display(result);//4->11->null

    }
    
}
