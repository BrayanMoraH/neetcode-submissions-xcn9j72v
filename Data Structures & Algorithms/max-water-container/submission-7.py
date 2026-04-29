class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left = 0
        right = len(heights) - 1
        max_value = 0

        while left < right:
            distance = abs(right - left)
            current_min = min(heights[left], heights[right])
            current_result = distance * current_min

            if current_result == 42:
                print("Left " + str(left))
                print("Right " + str(right))
                print("Distane " + str(distance))

            max_value = max(current_result, max_value)

            if heights[left] < heights[right]:
                left += 1
            else:
                right -= 1
        
        return max_value


