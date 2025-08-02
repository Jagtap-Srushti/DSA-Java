package GreedyAlgorithm;

import java.util.*;
public class FractionalKnapsack {
    public static void main(String[] args){
        int price[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;

        double ratio[][]=new double [price.length][2];

        for(int i=0;i<price.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=price[i]/(double)weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int capacity=W;
        int finalPrice=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                finalPrice+=price[idx];
                capacity-=weight[idx];
            }
            else{
                finalPrice+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("Final Price:"+finalPrice);
    }
}
