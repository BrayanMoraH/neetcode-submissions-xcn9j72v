class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        default = 1
        left = [0] * len(nums)
        right = [0] * len(nums)
        result = [0] * len(nums)

        for i in range(len(nums)):
            left[i] = default

            default *= nums[i]
        
        default = 1

        for i in reversed(range(len(nums))):
            right[i] = default
            default *= nums[i]
        

        for i in range(len(nums)):
            result[i] = left[i] * right[i]

        return result
