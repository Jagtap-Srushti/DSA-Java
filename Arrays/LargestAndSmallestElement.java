package Arrays;

public class LargestAndSmallestElement {
    public static int largestElement(int arr[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static int smallestElement(int arr[]){
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[]={12,78,90,45,30,75};
        System.out.println("Largest element inside array is: "+largestElement(arr));
        System.out.println("Smallest element inside array is: "+smallestElement(arr));

        
    }
    
}
