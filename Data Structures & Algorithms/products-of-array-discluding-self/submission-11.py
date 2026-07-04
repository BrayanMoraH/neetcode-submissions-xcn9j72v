class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        current_length = len(nums)
        left_array = [0] * current_length
        right_array = [0] * current_length
        result = [0] * current_length

        value = 1
        for index, num in enumerate(nums):
            left_array[index] = value
            value *= num
        
        value = 1

        for index in range(len(nums) -1, -1, -1):
            right_array[index] = value
            value *= nums[index]
        
        for index in range(current_length):
            result[index] = right_array[index] * left_array[index]


        return result
