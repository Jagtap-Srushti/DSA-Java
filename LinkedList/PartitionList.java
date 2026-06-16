/*86.PartitionList: Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.*/
package LinkedList;

public class PartitionList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insert(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            head = n1;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n1;
    }

    public Node partitionList(Node head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        Node lessDummy = new Node(0);
        Node greaterDummy = new Node(0);

        Node less = lessDummy;
        Node greater = greaterDummy;

        Node temp = head;
        while (temp != null) {
            if (temp.data < x) {
                less.next = temp;
                less = less.next;
            } else {
                greater.next = temp;
                greater = greater.next;
            }
            temp = temp.next;
        }
        greater.next = null;
        less.next = greaterDummy.next;

        return lessDummy.next;
    }

    public void display(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        PartitionList p1 = new PartitionList();

        p1.insert(1);
        p1.insert(4);
        p1.insert(3);
        p1.insert(2);
        p1.insert(5);
        p1.insert(2);

        p1.display(p1.head);// 1->4->3->2->5->2->null
        Node result = p1.partitionList(p1.head, 3);
        p1.display(result);// 1->2->2->4->3->5->null
    }
}