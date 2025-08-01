package GreedyAlgorithm;

import java.util.*;
public class ActivitySelection {
    public static void main(String[] args){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        ArrayList<Integer> ans=new ArrayList<>();

        //This code is used if activities are sorted by end time. 
        // int maxact=1;
        // ans.add(0);
        // int lastEnd=end[0];

        // for(int i=0;i<end.length;i++){
        //     if(start[i]>=lastEnd){
        //         ans.add(i);
        //         lastEnd=end[i];
        //         maxact++;
        //     }
        // }

        // System.out.println("Maximum activities are:"+maxact);
        // for(int i=0;i<ans.size();i++){
        //     System.out.print("A"+ans.get(i)+" ");
        // }

        int activities[][]=new int[start.length][3];
        
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //lambda function
        Arrays.sort(activities,Comparator.comparingInt(o->o[2]));

        int maxact=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];

        for(int i=0;i<activities.length;i++){
            if(activities[i][1]>=lastEnd){
                maxact++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }    
        }

        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
    
}
