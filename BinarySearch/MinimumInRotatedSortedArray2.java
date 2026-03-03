package BinarySearch;
//Given the sorted rotated array that may contain duplicates,return the minimum element of this array.
public class MinimumInRotatedSortedArray2 {
    public static int minimumElement(int arr[]){
        int low=0;
        int high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while (low<=high) {
            if(arr[low]<arr[high]){
                ans=Math.min(ans,arr[low]);
                break;
            }
            int mid=low+(high-low)/2;
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                ans=Math.min(ans,arr[low]);
                low++;
                high--;
                continue;
            }
            if(arr[low]<=arr[mid]){
                ans=Math.min(ans, arr[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
       int arr[]={4,5,6,7,0,1,2};
       System.out.println(minimumElement(arr));
    }
    
}
