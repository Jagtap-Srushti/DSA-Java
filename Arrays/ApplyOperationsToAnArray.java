//2460. Apply Operations to an Array

// You are given a 0-indexed array nums of size n consisting of non-negative integers.

// You need to apply n - 1 operations to this array where, in the ith operation (0-indexed), you will apply the following on the ith element of nums:

// If nums[i] == nums[i + 1], then multiply nums[i] by 2 and set nums[i + 1] to 0. Otherwise, you skip this operation.


package Arrays;

public class ApplyOperationsToAnArray {
    public static int[] applyOperations(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i]=arr[i]*2;
                arr[i+1]=arr[i]*0;
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,1,1,0};
        int result[]=applyOperations(arr); //ans: 1 4 2 0 0 0 
        for(int num:result){
            System.out.print(num+" ");
        }

    }
    
}