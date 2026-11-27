class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        stack = []
        max_value = 0

        for index in range(len(heights) + 1):
            current_height = 0 if index == len(heights) else heights[index]

            while(stack and heights[stack[-1]] > current_height):
                height = heights[stack.pop()]
                width = index if not stack else index - stack[-1] - 1
                max_value = max(height * width, max_value)
            
            stack.append(index)
        
        return max_value
