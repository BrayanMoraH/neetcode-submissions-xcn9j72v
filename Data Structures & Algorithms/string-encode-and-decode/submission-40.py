class Solution:

    def encode(self, strs: List[str]) -> str:
        result = ''
        for word in strs:
            result += str(len(word)) + '#' + word

        return result

    def decode(self, s: str) -> List[str]:
        result = []

        i = 0
        while i < len(s):
            current_len = ''
            while s[i] != '#':
                current_len += s[i]
                i += 1

            lenOfWord = int(current_len)
            current = ''
            left = i + 1

            while len(current) < lenOfWord:
                current += s[left]
                left += 1
            
            result.append(current)

            i = left
        
        return result
        

            






