package BinaryTree;

public class HeightOfTree {

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

    public static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=heightOfTree(root.left);
        int rightheight=heightOfTree(root.right);

        return Math.max(leftheight,rightheight)+1;

    }
    public static void main(String[] args) {
        /*
                1
               / \
              2   3
              
            /  \   \
            4   5   6

         */
        

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);

        System.out.println("Height of tree is:"+heightOfTree(root));
    }
    
}
