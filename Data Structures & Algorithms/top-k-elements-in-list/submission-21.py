class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        values = [0] * (1 + len(nums))
        numbers = {}

        for index, value in enumerate(values):
            values[index] = []
            
        for num in nums:
            numbers[num] = numbers.get(num, 0) + 1
        
        for key, value in numbers.items():
            values[value].append(key)
        
        result = [0] * k
        index = 0
        for my_value in reversed(values):
            for value in my_value:
                result[index] = value

                index += 1

                if index == k:
                    return result
                       
    
        return result

