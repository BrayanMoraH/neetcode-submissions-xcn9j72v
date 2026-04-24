class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        my_map = {}

        for index in range(len(nums)):
            result = target - nums[index]

            if result in my_map:
                return [my_map.get(result), index]
            
            my_map[nums[index]] = index
        
        return [-1, -1]