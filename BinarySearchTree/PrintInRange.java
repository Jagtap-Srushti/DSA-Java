package BinarySearchTree;

public class PrintInRange {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) return;

        if (root.data > k1) {
            printInRange(root.left, k1, k2); // left subtree may have nodes in range
        }

        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " "); // print current node
        }

        if (root.data < k2) {
            printInRange(root.right, k1, k2); // right subtree may have nodes in range
        }
    }




    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int values[] = { 4, 5, 1, 2, 3 ,8,7,6,9,10};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        printInRange(root, 3, 7);
        
    }
    
}
