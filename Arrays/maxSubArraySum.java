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
    public static int prefixSum(int arr[]){
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        
        for(int i=0;i<n;i++){
            int currSum=0;
            int start=i;
            for(int j=i;j<n;j++){
                int end=j;
                currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                maxSum=Math.max(currSum,maxSum);
            }
        }
        return maxSum;
    }

    public static int kadaneAlgorithm(int arr[]){
        int n=arr.length;
        int currSum=arr[0],maxSum=arr[0];
        for(int i=1;i<n;i++){
            currSum=Math.max(arr[i],currSum+arr[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;

    }
    
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        //  System.out.println(maxSubArraySumBrute(arr));
        // System.out.println(prefixSum(arr));
        System.out.println(kadaneAlgorithm(arr));
        
        
    }
    
}
