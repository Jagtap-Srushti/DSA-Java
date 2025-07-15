package Stack;

import java.util.*;
public class NextGreaterElement {

    public static int[] nextGreaterElement(int arr[]){
        int n=arr.length;
        Stack<Integer> s=new Stack<>();

        int answer[]=new int[n];

        for(int i=n-1;i>=0;i--){
            while(!s.empty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.empty()){
                answer[i]=-1;
            }
            else{
                answer[i]=arr[s.peek()];
            }
            s.push(i);
        }
        return answer;
    }
    public static void main(String[] args){
        int arr[]={6,8,0,1,3};
        // nextGreaterElement(arr);
        int result[]=nextGreaterElement(arr);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
    
}
