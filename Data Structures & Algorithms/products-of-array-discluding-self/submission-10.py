class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        left = [0] * len(nums)
        right = [0] * len(nums)
        result = [0] * len(nums)

        temp_value = 1
        for index in range(len(nums)):
            left[index] = temp_value
            temp_value *= nums[index]

        
        temp_value = 1
        for index in reversed(range(len(nums))):
            right[index] = temp_value
            temp_value *= nums[index]
        

        for index in range(len(nums)):
            result[index] = right[index] * left[index]
        
        return result



        