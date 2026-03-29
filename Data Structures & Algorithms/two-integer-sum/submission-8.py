class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        visited = {}

        for i in range(len(nums)):
            result = target - nums[i]

            if result in visited:
                return [visited.get(result), i]
            else:
                visited[nums[i]] = i
        return [-1, -1]

            
        # [3, 4, 5, 6] target = 7

        # 7 - 3 -> 3 -> 0
        # 4 - 7 -> 