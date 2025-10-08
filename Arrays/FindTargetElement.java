package Arrays;

import java.util.*;;

public class FindTargetElement{

    //Return a list of the target indices of nums after sorting nums in non-decreasing order.

    public static List<Integer> targetIndices(int arr[],int target){
        List<Integer> list=new ArrayList<>(); 

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int arr[]={1,2,5,2,3};   //after sorting [1,2,2,3,5]

        System.out.println(targetIndices(arr, 2));  //[1,2]
        
    }
    
}
