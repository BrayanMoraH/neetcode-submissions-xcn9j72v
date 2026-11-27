class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        n = len(heights)
        stack = []
        max_value = 0

        for index in range(n + 1):
            current_height = 0 if index == len(heights) else heights[index]

            while len(stack) > 0 and heights[stack[-1]] > current_height:
                height = heights[stack.pop()]
                width = index if not stack else index - stack[-1] - 1
                max_value = max(max_value, height * width)
            
            stack.append(index)
        
        return max_value




