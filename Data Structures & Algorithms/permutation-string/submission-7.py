class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False
        
        s1_array = [0] * 26
        s2_array = [0] * 26

        for value in range(len(s1)):
            s1_array[ord(s1[value]) - ord('a')] += 1
            s2_array[ord(s2[value]) - ord('a')] += 1

        for value in range(len(s1), len(s2)):
            if s1_array == s2_array:
                return True
            
            s2_array[ord(s2[value - len(s1)]) - ord('a')] -= 1
            s2_array[ord(s2[value]) - ord('a')] += 1

        


        return s1_array == s2_array



