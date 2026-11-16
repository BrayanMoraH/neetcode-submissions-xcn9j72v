class Solution:

    def encode(self, strs: List[str]) -> str:
        result = ""

        for current in strs:
            result += str(len(current)) + "#" + current
        
        return result


    def decode(self, s: str) -> List[str]:
        print(s)

        result = []
        index = 0
        while index < len(s):
            print(index)
            end = index
            len_word = ""

            while s[end] != "#":
                len_word += s[end]
                end += 1
            
            
            len_integer = int(len_word)
            index = end + 1
            end = index + len_integer

            result.append(s[index:end])
            index = end



        return result
