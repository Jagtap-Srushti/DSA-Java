package Arrays;
import java.util.*;
public class KthLargest {

    public static int kthLargestElement(int arr[],int k){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();

        for(int ele:arr){
            minHeap.add(ele);
            if(minHeap.size()>k){
                minHeap.remove();
            }
        }

        return minHeap.peek();

    }
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        System.out.println("Kth largest element is:"+kthLargestElement(arr, 2));

    }
    
}
