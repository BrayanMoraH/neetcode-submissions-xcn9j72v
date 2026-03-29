class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left = 0
        right = len(heights) - 1
        result = 0

        while left < right:
            min_val = min(heights[left], heights[right])
            abs_val = abs(left - right)

            current_result = min_val * abs_val

            if heights[left] < heights[right]:
                left += 1
            else:
                right -= 1
            
            result = max(current_result, result)
        
        return result
            








