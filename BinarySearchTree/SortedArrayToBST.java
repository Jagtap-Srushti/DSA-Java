package BinarySearchTree;

public class SortedArrayToBST {

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

    public static Node createBST(int arr[],int st,int ed){
        if(st>ed){
            return null;
        }
        int mid=(st+ed)/2;

        Node root=new Node(arr[mid]);
        root.left=createBST(arr,st,mid-1);
        root.right=createBST(arr, mid+1, ed);
        return root;

    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};

        /*
              8
            /  \
           5    11
          / \   / \
         3   6 10  11
         */

         Node root=createBST(arr, 0, arr.length-1);

         preorder(root);
    }
}