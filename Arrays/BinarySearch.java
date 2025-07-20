package Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[],int key){
        int low=0,high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;

            if(key==arr[mid]){
                return mid;
            }
            if(key>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};

        int key=5;
        int index=binarySearch(arr,key);

        if(index==-1){
            System.out.println(key+ " not found inside array");
        }
        else{
            System.out.println( key+" found at index: "+index);
        }
        
    }
    
}
