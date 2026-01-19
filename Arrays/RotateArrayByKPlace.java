package Arrays;

public class RotateArrayByKPlace {
    public static void rotateByKBrute(int arr[],int k){  //Brute force
        int n=arr.length;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }

        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }

        for(int i=0;i<k;i++){
            arr[n-k+i]=temp[i];
        }
    }
    
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        
    }

    public static void rotateByK(int arr[],int k){
        int n=arr.length;

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printArr(arr);
        rotateByK(arr,3);
        printArr(arr);
        
    }
    
}
