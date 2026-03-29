class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = 0
        sell = 1
        result = 0

        while sell < len(prices):

            profit = prices[sell] - prices[buy]

            if profit <= 0:
                buy = sell
                sell += 1
            else:
                sell += 1
                result = max(profit, result)
        
        return result




        