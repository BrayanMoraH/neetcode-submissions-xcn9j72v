class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int result = Integer.MIN_VALUE;


        while(sell < prices.length){
            int profit = prices[sell] - prices[buy];

            result = Math.max(profit, result);

            if(prices[sell] < prices[buy]){
                buy = sell;
                sell++;
            }else {
                sell++;
            }
        }


        if(result < 0 || result == Integer.MIN_VALUE){
            return 0;
        }

        return result;
    }
}
