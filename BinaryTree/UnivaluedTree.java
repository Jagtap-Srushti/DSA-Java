package BinaryTree;

public class UnivaluedTree {
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

    public static boolean isUnivaluedTree(Node root){
        if(root==null){
            return true;
        }
        return bfs(root,root.data);
    }

    public static boolean bfs(Node node,int target){
        if(node==null){
            return true;
        }

        if(node.data!=target){
            return false;
        }

        return bfs(node.left,target)&&bfs(node.right,target);
    }
    public static void main(String[] args) {
                        /*
                1
               / \
              2   2
            /  \  / \
            2   2 2  2

         */
        

        Node root=new Node(2);
        root.left=new Node(2);
        root.right=new Node(2);
        root.left.left=new Node(2);
        root.left.right=new Node(2);
        root.right.left=new Node(2);
        root.right.right=new Node(2);
        System.out.println(isUnivaluedTree(root));
        
    }
    
}
