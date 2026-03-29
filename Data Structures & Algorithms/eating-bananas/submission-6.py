class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        max_value = 0

        for pile in piles:
            max_value = max(max_value, pile)
        
        left = 1
        right = max_value

        while left <= right:

            middle = (left + right) // 2
            sum = 0

            for pile in piles:
                sum += math.ceil((pile / middle))
            
            print(sum)

            if sum <= h:
                right = middle - 1
            else:
                left = middle + 1
        
        return left