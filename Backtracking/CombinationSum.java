package Backtracking;

// Given an array of distinct integers and a target, you have to return the list of all unique combinations where the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from the given array an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

// It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.



import java.util.*;

public class CombinationSum {

    public List<List<Integer>> combinatioSum(int arr[],int target){
        List<List<Integer>> ans=new ArrayList<>();
        backtracking(ans,arr,target,new ArrayList<>(),0);
        return ans;
    }

    public void backtracking(List<List<Integer>> ans,int arr[],int target,List<Integer> curr,int i){

        if(i==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(curr));
                
            }
            return;
        }
        if(arr[i]<=target){
            curr.add(arr[i]);
            backtracking(ans, arr, target-arr[i], curr, i);
            curr.remove(curr.size()-1);
        }
        backtracking(ans, arr, target, curr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int target=7;
        CombinationSum obj=new CombinationSum();
        List<List<Integer>> result=obj.combinatioSum(arr,target);
        System.out.println(result);

        //ans:- [[2, 2, 3], [7]]

    }
}
