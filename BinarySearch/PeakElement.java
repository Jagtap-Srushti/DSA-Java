package BinarySearch;

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
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,3,2};
        System.out.println(peakElementOptimal(arr));
    }
    
}
