class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        visited = set()
        max_value = 0
        left = 0
        right = 0

        while right < len(s):
            current = s[right]

            while current in visited:
                left_value = s[left]

                visited.remove(left_value)
                left += 1
            
            visited.add(current)
            max_value = max(max_value, (right - left) + 1)
            right += 1
        
        return max_value

        

