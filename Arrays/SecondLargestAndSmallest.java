package Arrays;

public class SecondLargestAndSmallest {
    public static int secondLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int slargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else{
                if(arr[i]>slargest){
                    slargest=arr[i];
                }
            }
        }
        return slargest;
    }

    public static int  secondSmallest(int arr[]){
        int smallest=Integer.MAX_VALUE;
        int sSmallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                sSmallest=smallest;
                smallest=arr[i];
            }
            else{
                if(arr[i]<sSmallest){
                    sSmallest=arr[i];
                }
            }
        }
        return sSmallest;
    }
    public static void main(String[] args) {
        int arr[]={5,9,12,58,23,90};
        System.out.println("Second largest Element:"+secondLargest(arr));
        System.out.println("Second smallest element:"+secondSmallest(arr));

        
    }
    
}
