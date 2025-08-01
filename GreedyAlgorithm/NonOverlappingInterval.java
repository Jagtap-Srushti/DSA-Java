package GreedyAlgorithm;

import java.util.*;
public class NonOverlappingInterval {
    public static int  removeOverlappingInterval(int intervals[][]){
        Arrays.sort(intervals,Comparator.comparingInt(o->o[1]));

        int count=0;
        int previousIntervalEnd=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<previousIntervalEnd){
                count++;
            }
            else{
                previousIntervalEnd=intervals[i][1];
            }
        }

        return count;
    }
    public static void main(String[] args){
        int intervals[][]={
            {1,2},{2,3},{3,4},{1,3}
        };

        System.out.println("No of removed intervals are:"+removeOverlappingInterval(intervals));
    }
    
}
