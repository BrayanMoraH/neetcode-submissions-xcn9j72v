class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        values = [[] for _ in range(len(nums) + 1)]
        frequency = {}
        result = []

        for num in nums:
            frequency[num] = frequency.get(num, 0) + 1


        for key, value in frequency.items():
            values[value].append(key)

        index = 0

        print(values)
        for val in reversed(values):
            for num in val:
                result.append(num)
                index += 1

                if index == k:
                    return result
    
        return result




        


        



