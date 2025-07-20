package Arrays;

public class LargestElement {
    public static int largestElement(int arr[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={12,78,90,45,30,75};
        System.out.println("Largest element inside array is: "+largestElement(arr));
        
    }
    
}
