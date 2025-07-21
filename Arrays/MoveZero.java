package Arrays;

public class MoveZero {
    public static void moveZero(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
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
        int arr[]={1,0,2,0,0,3,0,4,5};
        System.out.println("Array before:");
        moveZero(arr);
        System.out.println("Array After moving all zero to end:");
        printArr(arr);
        
    }
    
}
