package Sorting;

public class CountingSort {
    public static void countingSort(int arr[]){
        int n=arr.length;
        int largest=0;
        for(int i=0;i<n;i++){
            largest=Math.max(largest,arr[i]);
        }

        int count[]=new int[largest+1];

        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
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
        int arr[]={1,2,3,1,1,4,5,2,6,1,7,8,6,9,4};
        printArr(arr);
        countingSort(arr);
        printArr(arr);
        
    }
    
}
