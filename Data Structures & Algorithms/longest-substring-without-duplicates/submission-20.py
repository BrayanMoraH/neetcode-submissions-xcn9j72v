class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = set()

        left = 0
        right = 0
        max_value = 0

        while right < len(s):
            current = s[right]
            print(current)

            if current not in seen:
                current_len = (right - left) + 1
                max_value = max(current_len, max_value)
                seen.add(current)
                right += 1
            else:
                seen.remove(s[left])
                left += 1
        
        return max_value

