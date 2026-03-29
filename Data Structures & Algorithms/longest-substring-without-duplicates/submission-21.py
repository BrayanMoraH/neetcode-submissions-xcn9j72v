class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = set()
        left = 0
        result = 0

        for right in range(len(s)):
            current = s[right]

            while current in seen:
                seen.remove(s[left])
                left += 1
            
            seen.add(current)
            
            result = max(result, (right - left + 1))

        
        return result