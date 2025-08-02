package GreedyAlgorithm;

import java.util.*;
public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());

        int amount=590;
        int totalcoins=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    amount-=coins[i];
                    ans.add(coins[i]);
                    totalcoins++;
                }
            }
        }

        System.out.println("Total number of coins required:"+totalcoins);

        System.out.println("Coins are:");
        for(int coin:ans){
            System.out.println(coin+" ");
        }
    }
    
    
}
