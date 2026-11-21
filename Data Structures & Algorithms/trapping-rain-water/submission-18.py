class Solution:
    def trap(self, height: List[int]) -> int:
        n = len(height)
        left = [0] * (n)
        right = [0] * (n)
        max_value = 0

        for index in range(n):
            max_value = max(height[index], max_value)
            left[index] = max_value
        
        max_value = 0

        for index in range(len(height) -1, -1, -1):
            max_value = max(height[index], max_value)
            right[index] = max_value


        current_sum = 0
        for index in range(n):
            current_sum += min(left[index], right[index]) - height[index]      


        return current_sum