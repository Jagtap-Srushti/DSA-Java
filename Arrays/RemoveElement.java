package Arrays;

public class RemoveElement {
    public static int  removeElement(int arr[],int val){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }

    
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4,1,1,5,6,1,7,1,1,8,9};
        int index=removeElement(arr, 1);
        
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
