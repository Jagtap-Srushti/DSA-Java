package Recursion;

public class FirstOccurenceOfEle {
    public static int firstOccurence(int arr[],int key,int i){
        if(arr.length-1==i){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={6,7,1,2,3,4,5,1};
        int key=1;
        System.out.println("First occurence index of element "+key+" is "+firstOccurence(arr, key,0));
    }
    
}
