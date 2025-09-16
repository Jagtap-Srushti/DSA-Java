package BinaryTree;


public class SameTree {
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

    public static boolean isSameTree(Node p,Node q){
        if(p==null && q==null){
            return true;
        }
        if(p==null||q==null||p.data!=q.data){
            return false;
        }

        return isSameTree(p.left,q.left)&&isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {

        Node p=new Node(1);
        p.left=new Node(2);
        p.right=new Node(3);

        
        //     1
        //    / \
        //   2   3
        
        Node q=new Node(1);
        q.left=new Node(2);
        q.right=new Node(3);

        //     1
        //    / \
        //   2   3

        if(isSameTree(p, q)){
            System.out.println("Both the trees are same");
        }
        else{
            System.out.println("Both trees are not same");
        }
    }
    
}
