class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack = []
        result = [0] * len(temperatures)

        for index in range(len(temperatures)):
            if not stack:
                stack.append(index)
                continue
            
            while len(stack) > 0 and temperatures[index] > temperatures[stack[-1]]:
                current_index = stack.pop()
                days = index - current_index
                result[current_index] = days
            
            stack.append(index)
        
        return result




