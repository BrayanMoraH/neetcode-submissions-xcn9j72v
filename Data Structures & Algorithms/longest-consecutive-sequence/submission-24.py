class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seen = set()
        max_value = 0

        for num in nums:
            seen.add(num)
        
        for current in seen:
            current_sum = 1
            if (current - 1) not in seen:
                value = current + 1
                while value in seen:

                    current_sum += 1
                    value += 1
            
            max_value = max(current_sum, max_value)
        
        return max_value
                

