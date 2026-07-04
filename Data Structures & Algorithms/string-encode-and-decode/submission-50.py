class Solution:

    def encode(self, strs: List[str]) -> str:
        result = ""
        for word in strs:
            result += str(len(word)) + "#" + word

        return result


    def decode(self, s: str) -> List[str]:
        result = []
        if len(s) == 0:
            return result

        i = 0
        while i < (len(s)):
            current_length = ""
            while s[i] != "#":
                current_length += s[i]
                i += 1
            
            print(current_length)
            
            length_int = int(current_length)

            i = i + 1
            j = i + length_int

            result.append(s[i:j])

            i = j



        return result
