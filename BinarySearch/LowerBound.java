package BinarySearch;

// Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.

public class LowerBound {
    public static int lowerBoundBrute(int arr[],int x){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>=x){
                return i;
            }
        }

        return n;
    }


    public static int lowerBoundOptimal(int arr[],int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,5,8,8,10,10,11};
        System.out.println(lowerBoundOptimal(arr, 9));
        
    }
    
}
