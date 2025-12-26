package LinkedList;
public class OddEvenLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    static class LinkedList{
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

        public void evenOdd(){
            if(head==null || head.next==null){
                return ;
            }

            Node odd=head;
            Node even=head.next;
            Node evenHead=even;

            while(even!=null && even.next!=null){
                odd.next=odd.next.next;
                even.next=even.next.next;

                odd=odd.next;
                even=even.next;
            }
            
            odd.next=evenHead;
        }

    
        }
        public static void main(String args[]){
            LinkedList l1=new LinkedList();

            l1.insert(1);
            l1.insert(2);
            l1.insert(3);
            l1.insert(4);
            l1.insert(5);
            l1.display();
            l1.evenOdd();
            l1.display();
    }
}
