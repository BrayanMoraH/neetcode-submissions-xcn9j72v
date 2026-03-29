class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        values = {}

        for index, num in enumerate(nums):
            result = target - num

            if result in values:
                return [values.get(result), index]
            else:
                values[num] = index
                
        return [-1, -1]
