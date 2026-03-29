class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        values = set()
        maxSequence = 0

        for num in nums:
            values.add(num)

        for value in values:
            current = 1

            if value - 1 not in values:
                value = value + 1
                while value in values:
                    current += 1
                    value += 1
            
            maxSequence = max(current, maxSequence)
        
        return maxSequence

