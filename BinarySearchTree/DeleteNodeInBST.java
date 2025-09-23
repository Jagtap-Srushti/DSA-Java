package BinarySearchTree;

public class DeleteNodeInBST {
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

    public static Node deleteNode(Node root, int val) {
        if (root.data > val) {
            root.left = deleteNode(root.left, val);
        }
        else if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } else {

            // No child(leaf Node)
            if (root.left == null && root.right == null) {
                return null;
            }

            // single child
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }
            // tow childern
            else {
                Node IS = findInorderSuccessor(root.right); // find inorder successor
                root.data = IS.data; // change the value of curr Node with inorder successor
                root.right = deleteNode(root.right, IS.data); // delete the inorder successor
                return root; // then return the curr Node;

            }
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
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
        int values[] = { 4, 5, 1, 2, 3 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        deleteNode(root, 3);
        inorder(root);

    }

}
