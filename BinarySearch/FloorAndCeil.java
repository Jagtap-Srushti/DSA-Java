package BinarySearch;
public class FloorAndCeil {
    public static int floor(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=target){
                ans=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    public static int ceil(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static int[] getFloorAndCeil(int arr[],int target){
        int f=floor(arr,target);
        int c=ceil(arr, target);
        return new int[]{f,c};
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 4, 7, 8, 10};
        int target = 5;
        int res[]=getFloorAndCeil(arr, target);
        System.out.println("Floor: "+res[0]+" "+"Ceil: "+res[1]);
    }
    
}
