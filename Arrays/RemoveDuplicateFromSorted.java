package Arrays;

public class RemoveDuplicateFromSorted {
    public static int removeDuplicate(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3};
        int index=removeDuplicate(arr);

        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
