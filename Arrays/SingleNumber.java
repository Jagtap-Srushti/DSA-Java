package Arrays;
import java.util.*;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.


public class SingleNumber {
    public static int singleNumber(int nums[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);    //In this way only one element left in set 
                                       //which appears only one time
            }
            else{
                set.add(nums[i]);
            }
        }

        return set.iterator().next();
    }
    public static void main(String[] args) {
        int nums[]={4,1,2,1,2,4,5};

        System.out.println("The number appears only once is:"+singleNumber(nums));
        
    }
    
}
