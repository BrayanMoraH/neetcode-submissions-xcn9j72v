class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        groups = [0] * (1 + len(nums))
        count_nums = {}

        for i in range(1 + len(nums)):
            groups[i] = []

        
        for num in nums:
            count_nums[num] = count_nums.get(num, 0) + 1
        

        for key, value in count_nums.items():
            groups[value].append(key)
        
        result = [0] * k
        index = 0

        for values in reversed(groups):
            for value in values:
                result[index] = value
                index += 1

                if index == k:
                    return result

        return result