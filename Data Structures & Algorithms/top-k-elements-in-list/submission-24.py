class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        groups = [0] * (len(nums) + 1)
        count_nums = {}

        for index in range(len(groups)):
            groups[index] = []
    
        
        for num in nums:
            count_nums[num] = count_nums.get(num, 0) + 1
        
        for key, value in count_nums.items():
            groups[value].append(key)
        
        result = []
        

        for values in reversed(groups):
            for value in values:
                result.append(value)
                if len(result) == k:
                    return result
        

        