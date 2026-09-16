// 817. Linked List Components

// You are given the head of a linked list containing unique integer values and an integer array nums that is a subset of the linked list values.

// Return the number of connected components in nums. A connected component is a non-empty, maximal sequence of consecutive nodes in the linked list such that every node's value belongs to nums.

package LinkedList;

import java.util.HashSet;

public class LinkedListComponents {
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

    public int numComponents(Node head, int nums[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        Node curr = head;
        int count = 0;
        while (curr != null) {
            if (set.contains(curr.data)) {
                if (curr.next == null || !set.contains(curr.next.data)) {
                    count++;
                }
            }

            curr = curr.next;
        }

        return count;
    }

    public static void main(String[] args) {
        LinkedListComponents l1 = new LinkedListComponents();
        l1.insert(0);
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);

        int nums[] = { 0, 1, 3 };

        System.out.println(l1.numComponents(l1.head, nums));
    }

}
