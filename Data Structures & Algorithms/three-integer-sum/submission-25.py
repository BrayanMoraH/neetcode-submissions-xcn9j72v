class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        sorted_nums = sorted(nums)
        result = []

        for index in range(len(sorted_nums)):
            if index > 0 and sorted_nums[index] == sorted_nums[index -1]:
                continue
            
            left = index + 1
            right = len(sorted_nums) - 1

            while left < right:
                sum = sorted_nums[index] + sorted_nums[left] + sorted_nums[right]

                if sum > 0:
                    right -= 1
                elif sum < 0:
                    left += 1
                else:
                    result.append([sorted_nums[index], sorted_nums[left], sorted_nums[right]])
                    left += 1
                    right -= 1

                    while left < len(sorted_nums) -1 and sorted_nums[left] == sorted_nums[left -1]:
                        left += 1
            
        return result


