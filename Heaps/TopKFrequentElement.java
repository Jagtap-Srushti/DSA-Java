package Heaps;

import java.util.*;
public class TopKFrequentElement {
    static class Pair implements Comparable<Pair>{
        int key;
        int freq;
        Pair(int key,int freq){
            this.key=key;
            this.freq=freq;
        }

        public int compareTo(Pair p2){
            return p2.freq-this.freq;
        }

    }

    public static int[] topkFreq(int nums[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Pair> pq=new PriorityQueue<>();

        for(int key:map.keySet()){
            pq.add(new Pair(key,map.get(key)));
        }

        int result[]=new int[k];

        for(int i=0;i<k;i++){
            result[i]=pq.remove().key;
        }

        return result;
    }
    public static void main(String[] args) {
        int nums[]={1,1,1,2,2,3};
        int k=2;
        int result[]=topkFreq(nums,k);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

        

        
    }
    
}
