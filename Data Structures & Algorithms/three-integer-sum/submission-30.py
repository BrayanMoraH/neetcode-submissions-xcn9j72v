class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        sorted_nums = sorted(nums)
        result = []

        for index in range(len(nums)):


            if index > 0 and sorted_nums[index] == sorted_nums[index - 1]:
                continue
            
            left = index + 1
            right = len(nums) -1


            while left < right:

                current_sum = sorted_nums[index] + sorted_nums[left] + sorted_nums[right]

                if current_sum > 0:
                    right -= 1
                elif current_sum < 0:
                    left += 1
                else:
                    result.append([sorted_nums[index], sorted_nums[left], sorted_nums[right]])
                    left += 1
                    right -= 1

                    while left < right and sorted_nums[left] == sorted_nums[left -1]:
                        left += 1

        return result