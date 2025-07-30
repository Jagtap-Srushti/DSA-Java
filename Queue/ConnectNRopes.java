package Queue;

import java.util.*;
public class ConnectNRopes {

/*Given are N ropes of different lengths,the task is to connect these ropes into one rope with minimum cost,
 such that the cost to connect two ropes is equal to the sum of their lengths*/
    public static int minCost(int ropes[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }

        int totalCost=0;

        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
            int cost=first+second;
            totalCost+=cost;
            pq.add(cost);
        }

        return totalCost;
    }
    public static void main(String[] args) {
        int ropes[]={4,3,2,6};
        System.out.println("Minimum cost is:"+minCost(ropes));

        
    }
    
}
