class Solution {
    public int maxProfit(int[] prices) {
        //[10, 1, 5, 6, 7, 1]
        //     b
        //                 s

        int result = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                int profit =  prices[j] - prices[i];
                result = Math.max(profit, result);
            }
        }

        if(result < 0) return 0;

        return result;
    }
}
