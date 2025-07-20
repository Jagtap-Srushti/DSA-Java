package Arrays;

public class pairsInArray {
    public static void printPair(int arr[]){
        int n=arr.length;

        for(int i=0;i<n;i++){
            int curr=arr[i];
            for(int j=i+1;j<n;j++){
                System.out.println(curr+","+arr[j]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        printPair(arr);
        
    }
    
}
