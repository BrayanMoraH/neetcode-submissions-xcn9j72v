class Solution:
    def isPalindrome(self, s: str) -> bool:
        left = 0
        right = len(s) - 1

        while left < right:
            while left < len(s) and not s[left].isdigit() and not s[left].isalpha():
                left += 1
            
            while right > left and not s[right].isdigit() and not s[right].isalpha():
                right -= 1
            
            if left < right and s[left].lower() != s[right].lower():
                return False
            
            left += 1
            right -= 1
            
        return True
           

        
        
