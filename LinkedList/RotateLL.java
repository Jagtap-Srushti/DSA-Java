package LinkedList;

public class RotateLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
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
            System.out.print("null");
        }

        public void rotate(Node head, int k) {
            if (head == null || head.next == null || k == 0) {
                return;
            }
            // step1 :find length and tail
            Node temp = head;
            int length = 1;

            while (temp.next != null) {
                temp = temp.next;
                length++;
            }
            // step 2 Optimize k
            k = k % length;
            if (k == 0) {
                return;
            }
            // step 3 make circular
            temp.next = head;
            // step 4find new tail
            Node curr = head;
            for (int i = 1; i < length - k; i++) {
                curr = curr.next;
            }

            // step 5 break circle
            this.head = curr.next;
            curr.next = null;
        }

    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);

        l1.display();
        l1.rotate(l1.head, 2);
        System.out.println();
        l1.display();

    }

}
