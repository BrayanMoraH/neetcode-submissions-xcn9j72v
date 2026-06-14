class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        result = []
        self.dfs(0, result, [], nums, 0, target)
        return result
    
    def dfs(self, i, result, current, nums, sum, target):

        if sum == target:
            result.append(current.copy())
            return
        
        if i >= len(nums) or sum > target:
            return
        
        current.append(nums[i])
        self.dfs(i, result, current, nums, sum + nums[i], target)
        current.pop()

        self.dfs(i + 1, result, current, nums, sum, target)






        