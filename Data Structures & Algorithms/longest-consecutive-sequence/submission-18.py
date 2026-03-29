class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        visited = set()
        result = 0

        for num in nums:
            visited.add(num)
        
        for value in visited:
            sum = 1

            if value -1 not in visited:

                current = value + 1
                while current in visited:
                    sum += 1
                    current += 1
                
                result = max(result, sum)
        
        return result