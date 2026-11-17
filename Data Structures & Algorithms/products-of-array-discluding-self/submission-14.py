class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = [0] * len(nums)
        right = [0] * len(nums)
        result = []
        n = len(nums)

        current = 1

        for index in range(n):
            left[index] = current
            current *= nums[index] 

        
        current = 1

        for index in reversed(range(n)):
            right[index] = current
            current *= nums[index]
        
        for index in range(n):
            result.append(left[index] * right[index])
        
        return result