package Arrays;

class NextPermutation {
    
    public static void nextPermutation(int arr[]){
        int n=arr.length;

        int idx=-1;
        //find dip
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }
        //if dip not found reverse array
        if(idx==-1){
            reverse(arr,0,n-1);
            return;
        }
        //find largest interger on right of idx and swap with idx element 
        for(int i=n-1;i>idx;i--){
            if(arr[i]>arr[idx]){
                swap(arr,i,idx);
                break;
            }
        }
        //reverse the remaining element from left of idx;
        reverse(arr,idx+1,n-1);


    }

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void reverse(int arr[],int start,int end){
        while(start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[]={1,3,2};
        nextPermutation(arr);
        printArr(arr);


    } 

    
}