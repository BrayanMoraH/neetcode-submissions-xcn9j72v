class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        n = len(nums) + 1

        values = [0] * n
        count = {}

        for index in range(n):
            values[index] = []
        
        for num in nums:
            count[num] = count.get(num, 0) + 1
        
        for key, value in count.items():
            values[value].append(key)

        index = 0
        result = []
        for current in reversed(values):
            for val in current:
                index += 1
                result.append(val)

                if index == k:
                    return result

        return result