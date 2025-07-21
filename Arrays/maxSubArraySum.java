package Arrays;

public class maxSubArraySum {
    public static int  maxSubArraySumBrute(int arr[]){
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                }
                maxSum=Math.max(maxSum,currSum);
            }
            
        }
        return maxSum;
    }

    
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
         System.out.println(maxSubArraySumBrute(arr));
        
        
    }
    
}
