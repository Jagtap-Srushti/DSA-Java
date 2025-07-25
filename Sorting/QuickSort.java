package Sorting;

public class QuickSort {
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotIndex=partition(arr,si,ei);
        quickSort(arr,si,pivotIndex-1);
        quickSort(arr,pivotIndex+1,ei);
    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){               //Elements less than the pivot go to the left of the pivot
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;                               // Places the pivot in its correct sorted position
        int temp=arr[ei];
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;                          //  Returns the pivot’s new index

    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[]={10,90,50,30,60,20,40,70,80};
        printArr(arr);
        quickSort(arr, 0, arr.length-1);
        printArr(arr);

        
    }
    
}
