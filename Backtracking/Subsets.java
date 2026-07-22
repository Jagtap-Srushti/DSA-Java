package Backtracking;
//Given an integer array nums of unique elements, return all possible subsets (the power set).

import java.util.*;
public class Subsets {

    public List<List<Integer>> subset(int nums[]){
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
        backtracking(ans, nums, curr, i+1);
        curr.remove(curr.size()-1);
        backtracking(ans, nums, curr, i+1);
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        Subsets obj=new Subsets();
        List<List<Integer>> result=obj.subset(nums);
        System.out.println(result);

        //ans- [[1, 2, 3], [1, 2], [1, 3], [1], [2, 3], [2], [3], []]
    
    }
}
