package BinaryTree;

import java.util.*;

public class DuplicateSubtree {
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

    public static String rec(Node curr,HashMap<String,Integer> map,List<Node> ans){
        if(curr==null){
            return "_";
        }

        String leftPart=rec(curr.left,map,ans);
        String rightPart=rec(curr.right,map,ans);

        String st=Integer.toString(curr.data)+"#"+leftPart+"#"+rightPart;

        if(map.containsKey(st)){
            if(map.get(st)==1){
                ans.add(curr);
            }
            map.put(st,map.get(st)+1);
        }
        else{
            map.put(st,1);
        }

        return st;
    }
    public static List<Node> duplicateSubtree(Node root){
        HashMap<String,Integer> map=new HashMap<>();
        List<Node> ans=new LinkedList<>();

        rec(root,map,ans);
        return ans;

    }

    public static void printSubtree(Node root) {
    if(root == null) {
        System.out.print("_ ");
        return;
    }
    System.out.print(root.data + " ");
    printSubtree(root.left);
    printSubtree(root.right);
}


    public static void main(String[] args) {
                        /*
                1
               / \
              4   3
            /    / \
            3    4  3
                /
               3
         */
        Node root=new Node(1);
        root.left=new Node(4);
        root.right=new Node(3);
        root.left.left=new Node(3);
        root.right.left=new Node(4);
        root.right.left.left=new Node(3);
        root.right.right=new Node(3);

        List<Node> result=duplicateSubtree(root);
        for(Node n1 : result){
            System.out.print("Duplicate subtree rooted at " + n1.data + ": ");
            printSubtree(n1);
            System.out.println();
        }

    
        
    }
    
}
