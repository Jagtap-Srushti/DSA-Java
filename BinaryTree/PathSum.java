package BinaryTree;


// Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

// A leaf is a node with no children.
public class PathSum {

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

    public static class BinaryTree{
        private int idx=-1;

        public Node buildTree(int nodes[]){
            idx++;
            if(idx>=nodes.length || nodes[idx]==-1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;

        }

        public boolean pathSum(Node root,int targetSum){
            if(root==null){
                return false;
            }
            targetSum-=root.data;
            if(root.left==null && root.right==null && targetSum==0){
                return true;
            }
            return pathSum(root.left,targetSum) || pathSum(root.right,targetSum);

        }
    }
    public static void main(String[] args) {
        int nodes[]={5,4,11,7,-1,-1,2,-1,-1,8,13,-1,-1,4,-1,1,-1,-1};

        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);

        System.out.println(tree.pathSum(root, 22));
    }
    
}
