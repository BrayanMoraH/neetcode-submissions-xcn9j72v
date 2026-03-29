class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        visited = {};

        for index, num in enumerate(nums):
            current = target - nums[index]

            if current in visited :
                return [visited.get(current), index]
            
            visited[nums[index]] = index
        
        return [-1, -1]
            

                
        