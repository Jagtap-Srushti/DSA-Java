package BinaryTree;

public class DeleteLeafWithXVal {
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

    public static Node deleteLeafNode(Node root,int x){
        if(root==null){
            return null;
        }

        root.left=deleteLeafNode(root.left,x);
        root.right=deleteLeafNode(root.right, x);

        if(root.left==null && root.right==null && root.data==x){
            return null;
        }

        return root;
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
                1
               / \
              2   3
            /  \  / \
            2   5 2  7

         */
        

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(2);
        root.left.right=new Node(5);
        root.right.left=new Node(2);
        root.right.right=new Node(7);
        inorder(root);
        deleteLeafNode(root, 2);
        System.out.println();

    
                            /*

            Output:-                
                1
               / \
              2   3
               \    \
                5    7

         */

        inorder(root);
    }
    
}
