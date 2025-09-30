package BinarySearchTree;

public class RangeSumOfBST {
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
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(root.data<val){
            root.right=insert(root.right,val);
        }
        else{
            root.left=insert(root.left, val);
        }

        return root;
    }
    
    public static int printRangeSum(Node root,int k1,int k2){
        if(root==null){
            return 0;
        }
        int sum=0;
        if(k1<root.data){
            sum+=printRangeSum(root.left, k1, k2);
        }
        if(root.data>=k1 && root.data<=k2){
            sum+=root.data;
        }
        if(k2>root.data){
            sum+=printRangeSum(root.right, k1, k2);
        }
        return sum;
    }

    public static void main(String[] args) {
        int values[] = { 4, 5, 1, 2, 3 ,8,7,6,9,10};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println("Sum of Nodes in range:"+printRangeSum(root, 3, 7));
        
    }
    
}
