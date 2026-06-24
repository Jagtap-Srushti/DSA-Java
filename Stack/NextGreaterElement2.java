package Stack;
// Problem Statement: Given a circular integer array arr, return the next greater element for every element in arr.
// The next greater element for an element x is the first element greater than x that we come across while traversing the array in a clockwise manner.
// If it doesn't exist, return -1 for that element element.

import java.util.*;
public class NextGreaterElement2 {

    public static int[] nextGreaterPermutation(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=n*2-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i%n]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()){
                    ans[i]=-1;
                }
                else{
                    ans[i]=st.peek();
                }
            }
            st.push(arr[i%n]);
        }

        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,3};
        int ans[]=nextGreaterPermutation(arr);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");  //ans:[2 3 4 -1 4] 
        }

    }
    
}
