package LinkedList;

class AddTwoNumbers {

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

        public Node addTwoNumber(Node l1,Node l2){
            Node dummy=new Node(0);
            Node temp=dummy;
            int carry=0;

            while(l1!=null || l2!=null || carry!=0){
                int sum=0;
                if(l1!=null){
                    sum+=l1.data;
                    l1=l1.next;
                }

                if(l2!=null){
                    sum+=l2.data;
                    l2=l2.next;
                }
                sum+=carry;
                Node node=new Node(sum%10);
                carry=sum/10;
                temp.next=node;
                temp=temp.next;
            }
            return dummy.next;
        }
    }
    public static void main(String[] args){
        LinkedList l1=new LinkedList();
        LinkedList l2=new LinkedList();

        l1.insert(2);
        l1.insert(4);
        l1.insert(3);

        l2.insert(5);
        l2.insert(6);
        l2.insert(7);
        l2.insert(9);

        Node result=l1.addTwoNumber(l1.head, l2.head);
        Node temp=result;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }

            System.out.println("null");

            //l1=2->4->9->null
            //l2=5->6->7->9->null
            //ans 7->0->1->0->1->null
    }
    
}