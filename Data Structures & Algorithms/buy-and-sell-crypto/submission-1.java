class Solution {
    public int maxProfit(int[] prices) {
        //[10, 1, 5, 6, 7, 1]
        //     b           s 


        // s - b 
        // 1 - 10 = -9
        // 6 - 1 = 4

        int b = 0;
        int s = 1;
        int result = 0;

        while(s < prices.length){
            int profit = prices[s] - prices[b];

            if(profit <= 0){
                b = s;
            }

            result = Math.max(result, profit);
            s++;
        }

        return result;

    }
}
