class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_dictionary = {}
        t_dictionary = {}

        for current in s:
            s_dictionary[current] = s_dictionary.get(current, 0) + 1
        
        for current in t:
            t_dictionary[current] = t_dictionary.get(current, 0) + 1;

        
        return s_dictionary == t_dictionary
