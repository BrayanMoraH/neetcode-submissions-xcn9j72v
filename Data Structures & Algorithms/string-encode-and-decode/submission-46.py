class Solution:

    def encode(self, strs: List[str]) -> str:
        result = ''
        for word in strs:
            result += str(len(word)) + '#' + word
        return result

    def decode(self, s: str) -> List[str]:
        i = 0
        result = []
        while i < len(s):
            j = i

            while s[j] != '#':
                j += 1
            
            word_length = int(s[i:j])
            i = j + 1
            j = i + word_length

            result.append(s[i:j])

            i = j

        return result


