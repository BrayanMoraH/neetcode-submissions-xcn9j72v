class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        
        my_stack = []
        result = [0] * len(temperatures)
        my_stack.append(0)


        for i in range(1, len(temperatures)):
        
            while len(my_stack) > 0 and temperatures[i] > temperatures[my_stack[-1]]:
                result[my_stack[-1]] = i - my_stack[-1]
                my_stack.pop()

            my_stack.append(i)

        return result 
