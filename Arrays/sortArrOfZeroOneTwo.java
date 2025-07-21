package Arrays;

public class sortArrOfZeroOneTwo {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sort(int arr[]){
        int n=arr.length;
        int low=0,mid=0,high=n-1;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }


    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,1,2,1};
        System.out.println("Array before sorting:");
        printArr(arr);

        sort(arr);
        System.out.println("Array after sorting:");
        printArr(arr);

        
    }
    
}
