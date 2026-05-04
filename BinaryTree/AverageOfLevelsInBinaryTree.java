package BinaryTree;

import java.util.*;


// Given the root of a binary tree, return the average value of the nodes on each level in the form of an array.

public class AverageOfLevelsInBinaryTree {

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

    public static List<Double> averageOfLevels(Node root){

        List<Double> result=new ArrayList<>();
        Queue<Node> q1=new LinkedList<>();
        if(root==null){
            return result;
        }

        q1.add(root);

        while(!q1.isEmpty()){
            int n=q1.size();
            long sum=0;      //take sum as long data type brcause if we add(Integer.MAX_VALUE) then it can not fit in integer data type
            for(int i=0;i<n;i++){
                Node curr=q1.remove();
                sum+=curr.data;

                if(curr.left!=null){
                    q1.add(curr.left);
                }

                if(curr.right!=null){
                    q1.add(curr.right);
                }
            }

            result.add((double)sum/n);
        }
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
             /  \
            15   7

*/

        // Ans:- [3.0, 14.5, 11.0]
        System.out.println(averageOfLevels(root));
    }
    
}
