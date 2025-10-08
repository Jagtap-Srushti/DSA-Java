package Arrays;

public class SearchInsertPosition {

    //Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.You must write an algorithm with O(log n) runtime complexity

    public static int search(int arr[],int target){

        int low=0,high=arr.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return low;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int target=2;

        System.out.println("Search position or index of "+ target+" is : "+search(arr, target));
        
    }
    
}
