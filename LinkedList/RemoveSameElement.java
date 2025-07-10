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

    public void removeElement(int data){
        //remove element at head
        if(head!=null && head.data==data){
            head=head.next;
        }
        //remove remaining elements
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.next.data==data){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
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

public class RemoveSameElement {
    public static void main(String[] args){
        LinkedList l1=new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(1);
        l1.insert(7);
        l1.insert(5);
        l1.insert(1);
        l1.insert(9);
        System.out.println("LinkedList before deleting Element");
        l1.display();    //1->2->3->1->7->5->1->9->null
        System.out.println("LinkedList after deleting Elemenet");
        l1.removeElement(1);
        l1.display();    //2->3->7->5->9->null

    }
    
}
