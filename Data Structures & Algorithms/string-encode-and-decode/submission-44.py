class Solution:

    def encode(self, strs: List[str]) -> str:
        result = ''
        for word in strs:
            result += str(len(word)) + '#' + word
        return result

    def decode(self, s: str) -> List[str]:
        print(s)
        i = 0
        result = []
        while i < len(s):
            j = i

            while s[j] != '#':
                j += 1
            
            length_word = int(s[i:j])

            i = j + 1
            j = i + length_word
            result.append(s[i:j])
            i = j
        
        return result





