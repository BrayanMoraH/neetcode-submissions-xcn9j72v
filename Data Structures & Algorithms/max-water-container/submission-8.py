class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left = 0
        right = len(heights) -1

        max_value = 0

        while left < right:

            distance = abs(left - right)
            min_value = min(heights[left], heights[right])

            current_result = distance * min_value

            max_value = max(current_result, max_value)


            if heights[left] <= heights[right]:
                left += 1
            else:
                right -= 1
        
        return max_value
