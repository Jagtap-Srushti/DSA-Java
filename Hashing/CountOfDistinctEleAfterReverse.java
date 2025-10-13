package Hashing;

import java.util.*;

public class CountOfDistinctEleAfterReverse {
    public static int countOfDistinctElement(int nums[]){
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            set.add(curr);
            int rev=0;
            while(curr>0){
                int lastDigit=curr%10;
                rev=rev*10+lastDigit;
                curr/=10;
            }
            set.add(rev);
        }

        return set.size();
    }

    public static void main(String[] args) {
        int nums[]={1,13,10,12,31};
        System.out.println(countOfDistinctElement(nums));  //ans:6 [1,13,10,12,21,31]
        
    }
}