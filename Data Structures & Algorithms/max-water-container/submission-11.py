class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left = 0
        right = len(heights) - 1
        max_value = 0

        while left < right:

            distance = right - left
            min_value = min(heights[left], heights[right])

            max_value = max(max_value, distance * min_value)

            if heights[left] < heights[right]:
                left += 1
            else:
                right -= 1
        
        return max_value

            