class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
      total_length = len(nums)
      left = [0] * total_length
      right = [0] * total_length
      result = [0] * total_length

      value = 1
      
      for index in range(total_length):
         left[index] = value
         value *= nums[index]

      print(left)

      value = 1

      for index in reversed(range(total_length)):
         right[index] = value
         value *= nums[index]

      for index, num in enumerate(nums):
         result[index] = left[index] * right[index]
      
      return result

