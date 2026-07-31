package Backtracking;

import java.util.*;

import javax.swing.text.PlainDocument;

public class PalindromePartitioning {

    public List<List<String>> palindrome(String s){
        List<List<String>> ans=new ArrayList<>();
        backtracking(s,ans,new ArrayList<String>(),0);
        return ans;
    }

    public void backtracking(String s,List<List<String>> ans,List<String> curr,int idx){

        if(idx==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                curr.add(s.substring(idx, i+1));
                backtracking(s,ans,curr,i+1);
                curr.remove(curr.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="aabb";
        PalindromePartitioning obj=new PalindromePartitioning();
        List<List<String>> result=obj.palindrome(s);
        System.out.println(result);

        //[[a, a, b, b], [a, a, bb], [aa, b, b], [aa, bb]]
    }
}
