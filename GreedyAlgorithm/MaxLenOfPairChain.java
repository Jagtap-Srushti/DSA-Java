package GreedyAlgorithm;
import java.util.*;
public class MaxLenOfPairChain {
    public static int maximumLength(int pairs[][]){
        Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));

        int len=1;
        int previousPairRight=pairs[0][1];

        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>previousPairRight){
                len++;
                previousPairRight=pairs[i][1];
            }
        }

        return len;

    }
    public static void main(String[] args){
        int pairs[][]={
            {1,2},
            {2,3},
            {3,4}
        };

        System.out.println("Length of longest chain formed is:"+maximumLength(pairs));
    }
    
}
