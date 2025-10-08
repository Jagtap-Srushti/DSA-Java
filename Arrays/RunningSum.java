package Arrays;

public class RunningSum {

    public static int[] runningSum(int arr[]){
        int n=arr.length;
        int result[]=new int[n];

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            result[i]=sum;
        }

        return result;

    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4};

        //Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

        int ans[]=runningSum(arr);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
