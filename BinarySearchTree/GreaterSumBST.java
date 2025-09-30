package BinarySearchTree;

public class GreaterSumBST {
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

    static int sum=0;


    public static void transform(Node root){
        if(root==null){
            return;
        }

        transform(root.right);

        int original=root.data;
        root.data=sum;
        sum+=original;

        transform(root.left);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {

        /*
                 10
                /  \
               6    15
              / \   / \
             3   8 11  18
         */

         /*
         Expected Output:-
                  44
                /    \
               62     18
              / \    /  \
             68  54 33   0     
          */
        Node root=new Node(10);
        root.left = new Node(6);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(8);
        root.right.left = new Node(11);
        root.right.right = new Node(18);

        System.out.println("Original BST (inorder):");
        inorder(root);

        sum = 0;
        transform(root);

        System.out.println("\nGreater Sum BST (inorder):");
        inorder(root);
    }
    
}
