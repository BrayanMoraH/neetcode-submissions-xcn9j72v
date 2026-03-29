class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;

      if(prices.length < 2) return 0;


      int left = 0;
      int right = 1;

      while(right < prices.length){
        int profit = prices[right] - prices[left];

        if(profit < 0){
            left = right;
            right++;
        }else {
            result = Math.max(result, profit);
            right++;
        }
      }

      return result;

    }
}
