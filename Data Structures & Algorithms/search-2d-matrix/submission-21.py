class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        left = 0
        right = len(matrix) - 1

        while left <= right:

            middle = (left + right) // 2

            if target > matrix[middle][len(matrix[middle]) - 1]:
                left = middle + 1
            elif target < matrix[middle][0]:
                right = middle - 1
            else:
                print("here :D")
                return self.search(matrix[middle], target)
        return False

    def search(self, nums, target) -> bool:

        left = 0
        right = len(nums) - 1

        while left <= right:
            middle = (left + right) // 2

            if nums[middle] > target:
                right = middle - 1
            elif nums[middle] < target:
                left = middle + 1
            else:
                return True
        
        return False


