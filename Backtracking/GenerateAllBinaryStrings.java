package Backtracking;

// Problem Statement: Given an integer n, return all binary strings of length n that do not contain consecutive 1s. Return the result in lexicographically increasing order.

import java.util.*;
public class GenerateAllBinaryStrings {

    public List<String> generateBinaryStrings(int n){
        List<String> ans=new ArrayList<>();
        backtracking(ans,"",n);
        return ans;
    }
    public void backtracking(List<String> ans,String curr,int n){

        if(curr.length()==n){
            ans.add(curr);
            return;
        }
        backtracking(ans, curr+"0", n);

        if(curr.isEmpty() || curr.charAt(curr.length()-1)!='1'){
            backtracking(ans, curr+"1", n);
        }
    }

    
    public static void main(String[] args) {
        int n=3;

        GenerateAllBinaryStrings obj=new GenerateAllBinaryStrings();

        List<String> result=obj.generateBinaryStrings(n);

        for(String str:result){
            System.out.println(str);
        }

        // ans:-
        // 000
        // 001
        // 010
        // 100
        // 101


        
    }
    
}
