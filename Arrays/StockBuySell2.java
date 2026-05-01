package Arrays;


// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can sell and buy the stock multiple times on the same day, ensuring you never hold more than one share of the stock.

// Find and return the maximum profit you can achieve.

 
public class StockBuySell2 {

    public static int stockBuySell(int prices[]){
        int n=prices.length;
        int maxProfit=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                maxProfit+=prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};

        System.out.println(stockBuySell(prices));
    }
    
}
