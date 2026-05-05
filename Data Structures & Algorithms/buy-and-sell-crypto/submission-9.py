class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        max_value = 0

        if len(prices) < 2:
            return max_value
        

        buy = 0
        sell = 1

        while sell < len(prices):

            result = prices[sell] - prices[buy]

            max_value = max(result, max_value)

            if result < 0:
                buy = sell
                sell = sell + 1
            else:
                sell += 1
        
        return max_value

