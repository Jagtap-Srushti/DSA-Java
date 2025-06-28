package Arrays;



import java.util.*;

public class LinearSearch {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
}

    public static void main(String [] args){
        int arr[]={12,80,37,70,81,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to find in array:");
        int key=sc.nextInt();
        int index=linearSearch(arr,key);
        if(index==-1){
            System.out.println("Element "+key+" not found inside array");
        }
        else{
            System.out.println("Element "+key+" found at index "+index);
        }
        

    }
    
}
