package BinarySearch;

// Given an array of length N, peak element is defined as the element greater than both of its neighbors. Formally, if arr[i] is the peak element, arr[i - 1] < arr[i] and arr[i + 1] < arr[i].

public class PeakElement {
    public static int peakElementOptimal(int arr[]){
        int n=arr.length;

        for(int i=0;i<n;i++){
            if((i==0 || arr[i]>arr[i-1]) &&
            (i==n-1 || arr[i]>arr[i+1])){

                return i;
            }
        }
        return -1;
    }

    public static int peakElement(int arr[]){
        int n=arr.length;
        if(n==1){
            return 0;
        }

        if(arr[0]>arr[1]){
            return 0;
        }

        if(arr[n-1]>arr[n-2]){
            return n-1;
        }

        int low=0;
        int high=n-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){           //mid is on left increasing slope and peak is on right
                low=mid+1;
            }
            else{
                high=mid-1;                        //mid is on right decreasing slope and peak is on left
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,1,2};
        System.out.println(peakElement(arr));
    }
    
}
