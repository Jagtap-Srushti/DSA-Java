package BinaryTree;

public class MaxPathSum {

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

    static int ans=0;

    public static int  rec(Node root){
        if(root==null){
            return 0;
        }

        int leftSum=Math.max(0,rec(root.left));
        int rightSum=Math.max(0,rec(root.right));

        ans=Math.max(ans,root.data+leftSum+rightSum);

        return root.data+Math.max(leftSum,rightSum);

    }

    public static int maxPathSum(Node root){
        ans=root.data;
        rec(root);
        return ans;
    }

    public static void main(String[] args) {
                        /*
               -10
               / \
              9   20
                 / \
                15  7
                
               
         */
        Node root=new Node(-10);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);

        System.out.println(maxPathSum(root));  //ans 42
        
    }
    
}
