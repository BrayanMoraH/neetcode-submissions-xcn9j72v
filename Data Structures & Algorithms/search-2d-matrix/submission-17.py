class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        values = []

        for value in matrix:
            for num in value:
                values.append(num)
        
        left = 0
        right = len(values) - 1

        while left <= right:
            middle = (left + right) // 2

            if values[middle] > target:
                right = middle -1
            elif values[middle] < target:
                left = middle + 1
            elif values[middle] == target:
                return True
                
        return False