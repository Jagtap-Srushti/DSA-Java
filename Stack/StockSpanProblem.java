package Stack;

import java.util.*;
public class StockSpanProblem {
    public static void stockSpan(int stock[],int span[]){
        Stack<Integer> s=new Stack<>();
        
        s.push(0);  //push first index;
        span[0]=1;  //first span always 1;

        for(int i=1;i<stock.length;i++){
            int currPrice=stock[i];
            while(!s.empty() && currPrice>=stock[s.peek()]){
                s.pop();
            }

            if(s.empty()){
                span[i]=i+1;
            }
            else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args){
        int stock[]={100,80,60,70,60,85,100};
        int span[]=new int[stock.length];
        stockSpan(stock,span);

        for(int i=0;i<stock.length;i++){
            System.out.print(span[i]+" ");
        }
    }    
}
