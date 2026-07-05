class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seen = set()
        result = 0

        for num in nums:
            seen.add(num)

        for num in nums:
            temp = num -1
            current_sum = 1
            if temp not in seen:
                num += 1
                while num in seen:
                    current_sum += 1
                    num += 1
            
            result = max(result, current_sum)
        
        return result


            

