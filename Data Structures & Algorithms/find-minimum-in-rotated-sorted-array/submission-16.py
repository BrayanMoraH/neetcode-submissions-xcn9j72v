class Solution:
    def findMin(self, nums: List[int]) -> int:
        result = float('inf')

        left = 0
        right = len(nums) - 1

        while left <= right:

            if nums[left] < nums[right]:
                result = min(result, nums[left])

            middle = (left + right) // 2

            result = min(nums[middle], result)

            print(nums[middle])

            if nums[middle] >= nums[left]:
                print("we move left")
                left = middle + 1
            else:
                print("we move right")
                right = middle - 1
        
        return result
