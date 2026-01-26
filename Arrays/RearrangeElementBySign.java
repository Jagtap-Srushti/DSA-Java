package Arrays;

public class RearrangeElementBySign {


    //Problem Statement: There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative     elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.
    public static int[] rearrangeElementBySign(int arr[]){
        int n=arr.length;
        int temp[]=new int[n];
        int positive=0;
        int negative=1;

        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp[negative]=arr[i];
                negative+=2;
            }
            else{
                temp[positive]=arr[i];
                positive+=2;
            }
        }

        return temp;
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};

        System.out.println("Array Before:");
        printArr(arr);

        System.out.println("Array After:");
        printArr(rearrangeElementBySign(arr));

    }
}