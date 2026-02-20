package BinarySearch;

public class SearchInsertPosition {

    public static int searchInsertPosition(int arr[],int ele){
        int low=0;
        int high=arr.length;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=ele){
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
        int arr[] = {1,2,4,7};
        System.out.println(searchInsertPosition(arr, 6));
    }
    
}
