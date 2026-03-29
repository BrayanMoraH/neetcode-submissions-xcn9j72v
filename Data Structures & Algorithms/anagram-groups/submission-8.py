class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = {}

        for current in strs:
            current_sorted = ''.join(sorted(current))

            if current_sorted not in result:
                result[current_sorted] = []
            
            result.get(current_sorted).append(current)

        my_result = list(result.values())

        return my_result