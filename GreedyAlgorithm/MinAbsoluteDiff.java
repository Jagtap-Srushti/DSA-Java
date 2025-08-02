package GreedyAlgorithm;

import java.util.*;
public class MinAbsoluteDiff {
    public static int minAbs(int a[],int b[]){
        Arrays.sort(a);
        Arrays.sort(b);
        int mindiff=0;
        for(int i=0;i<a.length;i++){
            mindiff+=Math.abs(a[i]-b[i]);
        }
        return mindiff;
    }
    public static void main(String[] args) {
        int a[]={2,3,5};
        int b[]={4,3,5};
        System.out.println("Minimum absolute difference of pair is:"+minAbs(a, b));
    }
    
}
