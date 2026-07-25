package Backtracking;
// Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

// Only numbers 1 through 9 are used.
// Each number is used at most once.
// Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

import java.util.*;
public class CombinationSumIII {

    public List<List<Integer>> combinationSum3(int k,int n){
        List<List<Integer>> ans=new ArrayList<>();
        backtracking(ans,new ArrayList<>(),k,n,1);
        return ans;
    }

    public void backtracking(List<List<Integer>> ans,List<Integer> curr,int k,int n,int i){

        if(k==0 && n==0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(i>n || i>9){
            return;
        }
        curr.add(i);
        backtracking(ans, curr, k-1, n-i, i+1); //include
        curr.remove(curr.size()-1);
        backtracking(ans, curr, k, n, i+1); //exclude
    }
    public static void main(String[] args) {
        int k=3;
        int n=9;

        CombinationSumIII obj=new CombinationSumIII();
        List<List<Integer>> result=obj.combinationSum3(k, n);
        System.out.println(result);
        //ans: [[1, 2, 6], [1, 3, 5], [2, 3, 4]]

    }    
}
