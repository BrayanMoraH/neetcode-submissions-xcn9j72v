class Solution:
    def trap(self, height: List[int]) -> int:
        left = [0] * len(height)
        right = [0] * len(height)

        max_value = 0

        for index in range(len(height)):
            max_value = max(height[index], max_value)
            left[index] = max_value
            
        
        max_value = 0

        for index in range(len(height) -1, -1, -1):
            max_value = max(height[index], max_value)
            right[index] = max_value
        
        sum = 0
        for index in range(len(left)):
            sum += min(left[index], right[index]) - height[index]
        
        return sum