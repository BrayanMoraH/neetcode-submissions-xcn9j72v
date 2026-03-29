class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
         left = [0] * len(nums)
         right = [0] * len(nums)
         result = [0] * len(nums)

         value = 1

         for index, num in enumerate(nums):
            left[index] = value
            value *= nums[index]

        
         value = 1

         for index, num in reversed(list(enumerate(nums))):
            right[index] = value
            value *= nums[index]
        
         for index, value in enumerate(nums):
            result[index] = left[index] * right[index]
        
         return result
