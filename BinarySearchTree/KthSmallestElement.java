package BinarySearchTree;

public class KthSmallestElement {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static int count=0;
    static Node result=null;

    public static void kthSmallest(Node root,int k){
        if(root==null){
            return;
        }

        kthSmallest(root.left, k);

        count++;
        if(count==k){
            result=root;
            return;
        }
        
        kthSmallest(root.right, k);
    }

    public static void main(String[] args) {

        /*
                 8
               /  \
              5    11
             / \     \
            3   6     20
         */
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(20);

        int k=4;
        kthSmallest(root, k);
        System.out.println("kth smallest element is:"+(result!=null ? result.data:"Not found"));
        
    }
    
}
