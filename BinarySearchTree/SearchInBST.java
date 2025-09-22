package BinarySearchTree;

public class SearchInBST {
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

    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }
        else{
            root.right=insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }

        if(key==root.data){
            return true;
        }

        if(key<root.data){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values[]={5,2,3,4,1};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }

        if(search(root, 3)){
            System.out.println("Key found inside the Binary Search Tree");
        }
        else{
            System.out.println("Key not found inside the Binary Search Tree");
        }
        
    }
    
}
