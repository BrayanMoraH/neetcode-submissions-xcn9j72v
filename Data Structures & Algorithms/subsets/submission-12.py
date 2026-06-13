class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result = []
        self.bactrack(nums, 0, [], result)
        return result

    def bactrack(self, nums, i, current, result):
        if i >= len(nums):
            result.append(current.copy())
            return
        
        current.append(nums[i])
        self.bactrack(nums, i + 1, current, result)
        current.pop()
        self.bactrack(nums, i + 1, current, result)

