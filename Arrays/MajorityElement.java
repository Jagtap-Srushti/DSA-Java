package Arrays;
public class MajorityElement {

    
    //Moore's voting algorithm
    public static int majorityElement(int arr[]){
        int n=arr.length;
        int ele=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
                ele=arr[i];
                count++;
            }
            else if(arr[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }
        return ele;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,3,2,2,2,2,4,4,4,5,5,2,2,2,2};
        System.out.println("Majority element is:"+majorityElement(arr));

    }
}
