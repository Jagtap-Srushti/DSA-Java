package BinarySearchTree;

public class ClosetElementInBST {
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

    public static int closetElement(Node root,int k){
        int closet=root.data;   //consider root as closet

        while(root!=null){
            if(Math.abs(root.data-k)<Math.abs(closet-k)){ //update closet
                closet=root.data;
            }

            if(k<root.data){
                root=root.left;       //closet element may be in left
            }
            else if(k>root.data){
                root=root.right;     //closet element may be in left
            }
            else{
                return root.data;    //exact match
            }
        }

        return closet;
    }
    public static void main(String[] args) {

        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.left.right=new Node(6);

        root.right=new Node(11);
        root.right.right=new Node(20);

        System.out.println("Closet Element is:"+closetElement(root, 19));


        
    }
    
}
