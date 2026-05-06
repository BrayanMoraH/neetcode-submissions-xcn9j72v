class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:

        if len(s1) > len(s2):
            return False
        
        s1_array = [0] * 26
        s2_array = [0] * 26

        s1_len = len(s1)

        for i in range(len(s1)):
            print(i)
            s1_array[ord(s1[i]) - ord('a')] += 1
            s2_array[ord(s2[i]) - ord('a')] += 1

        print(s1_array)
        print(s2_array)

        for i in range(s1_len, len(s2)):
            if s1_array == s2_array:
                return True
            
            s2_array[ord(s2[i - s1_len]) - ord('a')] -= 1
            s2_array[ord(s2[i]) - ord('a')] += 1
        

        return s1_array == s2_array