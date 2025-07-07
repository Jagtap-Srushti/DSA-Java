package LinkedList;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        next=null;
        prev=null;

    }
}

class DoublyLinkedList{
    Node head;
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }   

        newNode.next=head;
        head.prev=newNode;
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
        newNode.prev=temp;
    }


    public void insertAtMiddle(int data,int position){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        if(position==1){
            newNode.next=head;
            head.prev=newNode;
            return;
        }

        Node temp=head;
        for(int i=0;i<position-1;i++){
            if(temp==null){
                System.out.println("Position is out of bound");
                return;
            }
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next.prev=newNode;
        temp.next=newNode;
        newNode.prev=temp;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        head=head.next;
        head.next.prev=null;
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
        temp.next.prev=null;
    }

    public void deleteAtPosition(int position){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }

        if(position==1){
            if(head.next==null){
                head=null;
                return;
            }
            head=head.next;
            head.prev=null;
            return;
        }

        Node temp=head;
        for(int i=1;i<position-1;i++){
            if(temp==null){
                System.out.println("position is out of bound");
                return;
            }
            temp=temp.next;
        }
        Node deleteNode=temp.next;
        if(deleteNode==null){
            deleteNode.prev.next=null;
        }
        else{
            deleteNode.prev.next=deleteNode.next;
            deleteNode.next.prev=deleteNode.prev;
        }
    }


}

public class DoublyLL {
    public static void main(String[] args){
        DoublyLinkedList d1=new DoublyLinkedList();
        d1.insertAtEnd(1);
        d1.insertAtEnd(2);
        d1.insertAtEnd(3);
        d1.insertAtEnd(4);
        d1.deleteAtPosition(2);
        d1.display();

    }
    
}
