package BinarySearchTree;

import java.util.*;
public class PrintPathRootToLeaf {
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

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void printPath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println("null");
    }
    public static void printPathFromRootToLeaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }

        path.add(root.data);

        if(root.left==null && root.right==null){
            printPath(path);
        }
        printPathFromRootToLeaf(root.left, path);
        printPathFromRootToLeaf(root.right, path);
        path.remove(path.size()-1);


    }

    public static void main(String[] args) {

        /*
            8
           / \
          5   10
         / \   \
        3   6   11
                 \
                 14
         */
        int values[]={8,5,3,6,10,11,14};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }

        printPathFromRootToLeaf(root,new ArrayList<Integer>());
    }
    
}
