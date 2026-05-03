package BinaryTree;


// Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values. (i.e., from left to right, level by level from leaf to root).
import java.util.*;
class LevelOrderTraversal2 {

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> result=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            List<Integer> currLevel=new ArrayList<>();
            int n=q.size();

            for(int i=0;i<n;i++){
                Node curr=q.remove();
                currLevel.add(curr.data);

                if(curr.left!=null){
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    q.add(curr.right);
                }
            }

            result.add(currLevel);
        }

        Collections.reverse(result);
        return result;


    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
    /* 
            3
          /   \
         9    20
             /   \
            15    7

          */
        // ans:- [[15, 7], [9, 20], [3]]
        System.out.println(levelOrder(root));
    }
    
}