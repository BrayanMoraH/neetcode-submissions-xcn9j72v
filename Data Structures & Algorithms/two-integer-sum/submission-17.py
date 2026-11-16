class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        values = {}

        for index in range(len(nums)):
            result = target - nums[index]

            if result in values:
                return [values.get(result), index]
            
            values[nums[index]] = index
        
        return [-1, -1]

