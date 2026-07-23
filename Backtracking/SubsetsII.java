package Backtracking;

// Given an integer array nums that may contain duplicates, return all possible subsets (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

 


import java.util.*;
public class SubsetsII {

    public List<List<Integer>> subset2(int nums[]){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        backtracking(ans,nums,curr,0);
        return ans;
    }

    public void backtracking(List<List<Integer>> ans,int nums[],List<Integer> curr,int i){

        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        backtracking(ans,nums,curr,i+1);
        curr.remove(curr.size()-1);

        while(i<nums.length-1 && nums[i]==nums[i+1]){
            i++;
        }

        backtracking(ans, nums, curr, i+1);

    }
    public static void main(String[] args) {
        int nums[]={1,2,2};

        SubsetsII obj=new SubsetsII();
        List<List<Integer>> result=obj.subset2(nums);

        System.out.println(result);

        //ans : [[1, 2, 2], [1, 2], [1], [2, 2], [2], []]

    }
}
