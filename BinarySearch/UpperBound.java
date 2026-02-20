package BinarySearch;

public class UpperBound {
    public static int upperBound(int arr[],int x){
        int low=0;
        int high=arr.length;
        int ans=arr.length;
        while (low<=high) {
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
        int arr[]={1,2,3,3,5,7,8,8,11};
        System.out.println(upperBound(arr, 9));
        
    }
}
