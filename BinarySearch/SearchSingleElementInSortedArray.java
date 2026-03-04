package BinarySearch;

//Given an array of N integers. Every number in the array except one appears twice. Find the single number in the array.
public class SearchSingleElementInSortedArray {
    public static int findSingleElement(int arr[]){
        int n=arr.length;
        // If array has only one element, return it
        if(n==1){
            return arr[0];
        }

        // If first element is not equal to second, then first element is single
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        // If last element is not equal to second last, then last element is single
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }

        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=low+(high-low)/2;

            //If mid element is not equal to its neighbors, then it is the single element
            if(arr[mid-1]!=arr[mid] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            //Case 1:
            // If mid is odd and equals previous element,OR mid is even and equals next element,then single element is on right side
            if((mid%2!=0 && arr[mid]==arr[mid-1])||(mid%2==0 &&arr[mid]==arr[mid+1])){
                low=mid+1; //move search space to right
            }
            else{
                high=mid-1;  //move search space to left
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4,8,8};
        System.out.println(findSingleElement(arr));
    }
    
}
