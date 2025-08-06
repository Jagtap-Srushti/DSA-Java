package BinaryTree;

public class SumOfLeftLeaves {
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

    public static int sumOfLeftLeaves(Node root){
        if(root==null){
            return 0;
        }

        int sum=0;

        if(root.left!=null && root.left.left==null && root.left.right==null){
            sum+=root.left.data;
            return sum;
        }

        sum+=sumOfLeftLeaves(root.left);
        sum+=sumOfLeftLeaves(root.right);

        return sum;


    }
    public static void main(String[] args) {
    /*
                1
               / \
              2   3
            /  \  / \
            4   5 5  6

    */
        

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.left=new Node(5);

        System.out.println("Sum of left Leaves of tree is :"+sumOfLeftLeaves(root));
    }
    
}
