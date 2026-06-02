class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result = []
        self.backtrack(nums, [], result, 0)
        return result

    def backtrack(self, nums, current, result, i):
        if i >= len(nums):
            result.append(current.copy())
            return
        
        current.append(nums[i])
        self.backtrack(nums, current, result, i + 1)

        current.pop()
        self.backtrack(nums, current, result, i + 1)
        
    
    




        