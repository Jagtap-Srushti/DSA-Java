package BinarySearchTree;

public class ConvertSortedArraytoBST {

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node builtTree(int arr[],int left,int right){
        //this is the base case
        if(left>right){
            return null;
        }
        //find the middle element
        int mid=left+(right-left)/2;

        //create root
        Node root=new Node(arr[mid]);

        //built left subtree
        root.left=builtTree(arr,left,mid-1);
        //built right subtree
        root.right=builtTree(arr,mid+1,right);

        return root;

    }

    public static Node sortedArrayToBST(int arr[]){
        return builtTree(arr,0,arr.length-1);
    }

     public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
      int arr[] = {-10, -5, 0, 2, 5};

        Node root = sortedArrayToBST(arr);

        System.out.println("Preorder Traversal of BST:");
        preorder(root);
    }
    
}
