class Solution:
    def findMin(self, nums: List[int]) -> int:
        left = 0
        right = len(nums) - 1
        result = math.inf

        while left <= right:

            middle = (left + right) // 2

            if nums[left] < nums[middle] and nums[middle] < nums[right]:
                result = min(nums[left], result)
            
            result = min(result, nums[middle])

            if nums[left] <= nums[middle]:
                left = middle + 1
            else:
                right = middle -1
    

        return result
            

