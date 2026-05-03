class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        max_value = 0
        result = float('inf')

        for pile in piles:
            max_value = max(pile, max_value)
        
        left = 1
        right = max_value

        while left <= right:
            middle = (left + right) // 2

            sum = 0
            for pile in piles:
                sum += math.ceil(pile / middle)
            

            if sum <= h:
                result = min(middle, result)
                right = middle - 1
            else:
                left = middle + 1
        
        return result

