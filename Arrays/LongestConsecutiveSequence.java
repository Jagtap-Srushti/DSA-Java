package Arrays;

import java.util.*;

//Given an array nums of n integers.Return the length of the longest sequence of consecutive integers. The integers in this sequence can appear in any order.

public class LongestConsecutiveSequence {
    public static int longestSequence(int arr[]){
        int n=arr.length;
        int longest=1;

        if(n==0){
            return 0;
        }

        Set<Integer> st=new HashSet<>();

        for(int i=0;i<n;i++){
            st.add(arr[i]);
        }

        for(int ele:st){
            if(!st.contains(ele-1)){
                int count=1;
                int x=ele;

                while(st.contains(x+1)){
                    count++;
                    x=x+1;
                }

                longest=Math.max(count, longest);
            }
        }

        return longest;

    }
    public static void main(String[] args) {
        int arr[]={1,1,100,2,3,101,4,103,102,5};

        System.out.println(longestSequence(arr));
    }
}
