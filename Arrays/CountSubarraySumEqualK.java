package Arrays;

//Given an array of integers and an integer k, return the total number of subarrays whose sum equals k. 
public class CountSubarraySumEqualK {
    public static int countSubarraySumEqualK(int arr[],int k){
        int n=arr.length;
        int count=0;

        // Traverse all possible end indices from start
        for(int i=0;i<n;i++){
            int sum=0;
            // Add current element to sum
            for(int j=i;j<n;j++){
                sum+=arr[j];

                if(sum==k){
                    count++;        //// If sum equals k, increment count
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};

        System.out.println(countSubarraySumEqualK(arr, 3));
    }
    
}
