package LinkedList;

//delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node removeDuplicate() {
        if (head == null) { // If list is empty, return as it is
            return head;
        }
        // Dummy node helps handle cases where head itself is duplicate
        Node dummy = new Node(0);
        dummy.next = head;

        // prev points to the last confirmed unique node
        Node prev = dummy;

        // curr is used to traverse the linked list
        Node curr = head;

        while (curr != null) {

            // Check if current node is the start of a duplicate block
            if (curr.next != null && curr.data == curr.next.data) {
                int dupval = curr.data; // Store duplicate value

                // Skip all nodes having this duplicate value
                while (curr != null && curr.data == dupval) {
                    curr = curr.next;
                }
                // Link previous unique node to the next non-duplicate node
                prev.next = curr;
            } else {
                // Current node is unique, move prev forward
                prev = curr;
                curr = curr.next;
            }
        }
        return dummy.next;
    }

}

public class removeDuplicateII {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.insert(1);
        l1.insert(2);
        l1.insert(2);
        l1.insert(2);
        l1.insert(3);
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);
        l1.insert(6);
        l1.insert(7);
        l1.insert(7);

        l1.display();
        l1.head = l1.removeDuplicate();
        l1.display();

    }

}
