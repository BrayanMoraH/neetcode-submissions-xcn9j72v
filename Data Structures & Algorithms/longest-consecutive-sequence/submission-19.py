class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seen = set()
        max_value = 0

        for num in nums:
            seen.add(num)
        
        for num in seen:
            current_sum = 1

            if num -1 not in seen:

                while num + 1 in seen:
                    current_sum += 1
                    num += 1
            
            max_value = max(max_value, current_sum)
        
        return max_value



