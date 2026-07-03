package LinkedList;
public class CircularLinkedList {
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
        Node tail;

        public void insertAtBeginning(int data){
            Node newNode= new Node(data);
            if(head==null){
                head=tail=newNode;
                tail.next=head;
        
            }
            else{
                newNode.next=head;
                head=newNode;
                tail.next=head;
            }
        }

        public void insertAtEnd(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                tail.next=head;
            }
            else{
                tail.next=newNode;
                tail=newNode;
                tail.next=head;

            }
        }

        public void deleteAtBeginning(){
            if(head==null){
                System.out.println("LinkedList is Empty");
                return;
            }if(head.next==head){
                head=tail=null;
                return;
            }
            head=head.next;
            tail.next=head;
        }

        public void deleteAtEnd(){
            if(head==null){
                System.out.println("LinkedList is Empty");
                return;
            }
            
            if(head==tail){
                head=tail=null;
                return;
            }

            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            tail=temp;
            tail.next=head;
        }

        public void display(){
            if(head==null){
                System.out.println("Linkedlist is empty");
                return;
            }

            Node temp=head;
            do{
                System.out.print(temp.data+" ");
                temp=temp.next;
            }while(temp!=head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.insertAtEnd(1);
        l1.insertAtEnd(2);
        l1.insertAtEnd(3);
        l1.insertAtEnd(4);
        l1.insertAtEnd(5);
        l1.insertAtBeginning(10);
        l1.display();//10 1 2 3 4 5 
        l1.deleteAtBeginning();
        l1.display();//1 2 3 4 5 
        l1.deleteAtEnd();
        l1.display();1 2 3 4 

    }
    
}
