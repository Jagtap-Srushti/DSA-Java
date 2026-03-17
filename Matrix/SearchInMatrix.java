package Matrix;

//You are given a sorted 2D matrix where each row is in increasing order and the first element of each row is greater than the last element of the previous row, and you need to determine whether a given target value exists in the matrix.
public class SearchInMatrix {
    public static boolean search(int arr[][],int target){
        int m=arr.length;
        int n=arr[0].length;
        int low=0;
        int high=(m*n)-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid/n][mid%n]==target){
                return true;
            }
            if(arr[mid/n][mid%n]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[][]={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };

        System.out.println(search(arr, 3));
    }
    
}
