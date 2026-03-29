class Solution {
    public int maxProfit(int[] prices) {
     //[10,1,5,6,7,1]
     //    b
     //            s   

     //[10,8,7,5,2]
     //        s
     //          b

     int profit = 0;
     int buy = 0;
     int sell = 1;

     while(sell < prices.length){
        int currentProfit = prices[sell] - prices[buy];

        if(prices[sell] < prices[buy]){
            buy = sell;
        }

        profit = Math.max(currentProfit, profit);

        sell++;
     }

     return profit;
    }
}
