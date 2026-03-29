class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        count = {}

        left = 0
        right = 0
        max_f = 0
        result = 0

        while right < len(s):
            current_value = s[right]
            count[current_value] = count.get(current_value, 0) + 1

            max_f = max(max_f, count[current_value])

            while (right - left + 1) - max_f > k:
                count[s[left]] -= 1
                left += 1
            
            result = max((right - left + 1), result)

            right += 1
        
        return result
            



