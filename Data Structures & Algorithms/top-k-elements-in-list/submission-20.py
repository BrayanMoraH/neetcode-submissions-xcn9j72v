class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        my_array = [0] * (1 + len(nums))
        values = {}
        result = [0] * k
        index = 0

        for i in range(len(my_array)):
            my_array[i] = []

        for num in nums:
            values[num] = values.get(num, 0) + 1

        
        for key, value in values.items():
            my_array[value].append(key)

        for my_list in reversed(my_array):
            for value in my_list:
                result[index] = value
                index += 1

                if index == k:
                    return result
        
        return result

