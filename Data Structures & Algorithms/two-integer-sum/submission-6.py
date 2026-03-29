class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        visited = {}

        for index, num in enumerate(nums):
            result = target - num

            if result in visited:
                return [visited[result], index]
            else:
                visited[num] = index

        return [-1, -1]