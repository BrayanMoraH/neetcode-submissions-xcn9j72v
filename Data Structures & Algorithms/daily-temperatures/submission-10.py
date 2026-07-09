class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:

        values = []
        result = [0] * len(temperatures)

        for index in range(len(temperatures)):

            while len(values) > 0 and temperatures[values[-1]] < temperatures[index]:
                prev_index = values.pop()
                days = abs(index - prev_index)
                result[prev_index] = days
            
            values.append(index)
        
        return result


