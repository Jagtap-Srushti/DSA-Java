package BinaryTree;

public class DiameterOfTree {
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

    public static int  height(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        int ht=Math.max(leftheight,rightheight)+1;
        return ht;
    }

    public static int diameter1(Node root){
        if(root==null){
            return 0;
        }

        int leftDiameter=diameter1(root.left);
        int leftHt=height(root.left);
        int rightDiameter=diameter1(root.right);
        int rightHt=height(root.right);
        int selfDiameter=leftHt+rightHt+1;

        return Math.max(leftDiameter,Math.max(rightDiameter,selfDiameter));
    }

    static class Info{
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }

    public static Info diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);
        int selfDiam=leftInfo.ht+rightInfo.ht+1;

        int diam=Math.max(leftInfo.diam,Math.max(rightInfo.diam,selfDiam));
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(diam,ht);
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

        System.out.println("Diameter of tree:"+diameter(root).diam);
    }
    
}
