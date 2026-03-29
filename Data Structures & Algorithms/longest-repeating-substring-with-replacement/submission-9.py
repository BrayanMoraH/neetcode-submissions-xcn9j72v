class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        count_characters = {}
        most_frequent = 0
        result = 0

        left = 0

        for right in range(len(s)):
            count_characters[s[right]] = count_characters.get(s[right], 0) + 1

            most_frequent = max(count_characters[s[right]], most_frequent)

            while (right - left + 1) - most_frequent > k:
                count_characters[s[left]] = count_characters.get(s[left], 0) - 1
                left += 1
            
            result = max((right - left + 1), result)
        
        return result

