package Hashing;

import java.util.*;
public class MajorityElement {
    public static List<Integer> majorityElement(int nums[]){
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                list.add(key);
            }
        }

        return list;

    }
    public static void main(String[] args) {
        //Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
        int nums[]={3,2,3};
        System.out.println(majorityElement(nums));
    }
    
}
