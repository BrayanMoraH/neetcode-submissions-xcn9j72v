class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s2) < len(s1):
            return False
        
        s1_array = [0] * 26
        s2_array = [0] * 26

        for index in range(len(s1)):
            s1_array[ord(s1[index]) - ord('a')] += 1
            s2_array[ord(s2[index]) - ord('a')] += 1

        for index in range(len(s1), len(s2)):
            if s1_array == s2_array:
                return True
            
            start = index - len(s1)
            s2_array[ord(s2[start]) - ord('a')] -= 1
            s2_array[ord(s2[index]) - ord('a')] += 1
        
        return s2_array == s1_array