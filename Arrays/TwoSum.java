package Arrays;

import java.util.*;

//Given an array of integers arr[] and an integer target.Return true if there exist two numbers such that their sum is equal to the target. Otherwise, return false.
public class TwoSum {

    public static boolean twoSumBrute(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static int [] twoSum(int arr[],int target){
        int n=arr.length;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int complement=target-arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i], i);
        }

        return new int[]{-1,-1};
    }

    public static boolean twoSumOptimal(int arr[],int target){
        int n=arr.length;

        Arrays.sort(arr);

        int left=0;
        int right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return true;
            }
            if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        int arr[]={4,7,1,9};
        System.out.println(twoSumOptimal(arr, 8));
    }
}
