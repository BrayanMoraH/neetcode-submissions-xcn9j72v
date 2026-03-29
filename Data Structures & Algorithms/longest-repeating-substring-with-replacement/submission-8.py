class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        counts = {}
        max_val = 0

        left = 0
        result = 0

        for right in range(len(s)):
            counts[s[right]] = 1 + counts.get(s[right], 0)
            max_val = max(max_val, counts[s[right]])

            while (right - left + 1) - max_val > k:
                counts[s[left]] = counts.get(s[left], 0) - 1
                left += 1
            
            result = max((right - left + 1), result)
            

        return result
        