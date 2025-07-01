package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class LinkedList{
    Node head;

    public void insertAtStart(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void insertAtEnd(int data){
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

    public void insertAtPosition(int data,int position){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        if(position==0){
            newNode.next=head;
            head=newNode;
            return;
        }

        Node temp=head;

        for(int i=0;i<position-1;i++){
            if(temp==null){
                System.out.println("Position out of bound");
                return;
            }
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("Linkedlist is Empty");
            return;
        }
        head=head.next;
    }

    public void deleteAtEnd(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public void deleteAtPosition(int position){
        if(head==null){
           System.out.println("LinkedList is empty");
           return; 
        }
        if(position==0){
            head=head.next;
            return;
        }

        Node temp=head;
        for(int i=0;i<position-1;i++){
            if(temp==null || temp.next==null){
                System.out.println("position out of Bound");
                return;
            }
            temp=temp.next;
        }
        Node deleteNode=temp.next;
        temp.next=deleteNode.next;
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
public class LLOperation {
    public static void main(String[] args){

        LinkedList l1=new LinkedList();
        LinkedList l2=new LinkedList();

        System.out.println("Insert Element At Start of LinkedList:");
        l1.insertAtStart(1);
        l1.insertAtStart(2);
        l1.insertAtStart(3);
        l1.insertAtStart(4);
        l1.insertAtStart(5);
        l1.display();     //5->4->3->2->1->null

        System.out.println("Insert Element at the end of the LinkedList:");
        l2.insertAtEnd(1);
        l2.insertAtEnd(2);
        l2.insertAtEnd(3);
        l2.insertAtEnd(4);
        l2.insertAtEnd(5);
        l2.display();    // 1->2->3->4->5->null

        System.out.println("Inserting element at perticular position:");
        l2.insertAtPosition(35,2);
        l2.display();    //1->2->35->3->4->5->null

        System.out.println("Deleting elemnt at beginning:");
        l1.deleteAtBeginning();
        l1.display();

        System.out.println("Deleting element at end:");
        l1.deleteAtEnd();
        l1.display();

        System.out.println("Deleting element at perticular position:");
        l2.deleteAtPosition(4);
        l2.display();



    }
    
}
