class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        reversed_s = "".join(sorted(s))
        reversed_t = "".join(sorted(t))

        if reversed_s == reversed_t:
            return True
        
        return False
