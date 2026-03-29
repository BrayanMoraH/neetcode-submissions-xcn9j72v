class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        results = [0] * (len(temperatures))
        stack = []

        for index in range(len(temperatures)):
            
            while len(stack) != 0 and temperatures[stack[-1]] < temperatures[index]:
                day_before = stack.pop()
                days = abs(day_before - index)
                results[day_before] = days
            

            stack.append(index)
        
        return results
