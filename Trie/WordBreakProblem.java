package Trie;


public class WordBreakProblem {

    public static class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        public Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;

        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';

            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    public static boolean search(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }

        return curr.eow==true;
    }

    public static boolean wordbreak(String word){
        if(word.length()==0){
            return true;
        }

        for(int i=1;i<=word.length();i++){
            if(search(word.substring(0,i)) && wordbreak(word.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String word[]={"i","like","sam", "samsung","mobile","ice"};
        String key="ilikesamsung";

        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }

        System.out.println(wordbreak(key));
        
    }
    
}
