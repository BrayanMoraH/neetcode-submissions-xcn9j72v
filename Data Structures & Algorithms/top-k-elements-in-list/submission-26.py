class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count_nums = {}

        groups = [0] * (1 + len(nums))

        print(groups)

        for i in range(len(groups)):
            groups[i] = []        

        for num in nums:
            count_nums[num] = count_nums.get(num, 0) + 1


        for key, value in count_nums.items():
            groups[value].append(key)
        
        result = [0] * k
        index = 0

        print(groups)
        for values in reversed(groups):
            print(values)
            for value in values:
                result[index] = value
                index += 1

                if index == k:
                    return result


        return result
