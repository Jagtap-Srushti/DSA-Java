package Recursion;

public class LastOccurenceOfEle {
    public static int lastOccurence(int arr[],int key,int i){
        if(arr.length==i){
            return -1;
        }
        int lastEle=lastOccurence(arr, key, i+1);
        if(lastEle!=-1){
            return lastEle;
        }
        if(arr[i]==key){
            return i;
        }

        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1};
        int key=1;
        System.out.println("Last occurence of element "+key+" is "+lastOccurence(arr, key,0) );
    }
    
}
