package Arrays;

public class MaxConsecutiveOne {
    public static int maxConsecutiveOne(int arr[]){
        int maxCount=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxCount=Math.max(maxCount,count);
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,4,1,1,5,1,1,1,1};
        System.out.println("Maximum consecutive one:"+maxConsecutiveOne(arr));
        
    }
    
}
