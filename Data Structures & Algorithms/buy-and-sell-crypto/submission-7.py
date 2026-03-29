class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = 0
        sell = 1
        result = 0

        while buy < sell and sell <= len(prices) -1:

            profit = (prices[sell] - prices[buy])
            if profit <= 0:
                buy = sell
                sell += 1
            else:
                result = max(result, profit)
                sell += 1
        
        return result

