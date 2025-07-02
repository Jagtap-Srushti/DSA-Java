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

    public int search(int key){
        Node temp=head;
        int idx=0;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            idx++;
            temp=temp.next;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;

    }
    public int recsearch(int key){
        return helper(head,key);
    }
}

public class LLSearching {
    public static void main(String[] args){
        LinkedList l1=new LinkedList();
        l1.insert(12);
        l1.insert(78);
        l1.insert(23);
        l1.insert(45);
        l1.insert(90);

        int index=l1.recsearch(45);

        if(index==-1){
            System.out.println("Key not found inside the LinkedList ");
        }
        else{
            System.out.println("'Key found inside the LinkedList at index: "+index);
        }

    }
    
}
