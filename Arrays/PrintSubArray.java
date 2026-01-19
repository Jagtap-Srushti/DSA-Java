package Arrays;

public class PrintSubArray {
    public static void printSubArray(int arr[]){
        int n=arr.length;
        int tp=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total pairs:"+tp);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printSubArray(arr);
        
    }
    
}
