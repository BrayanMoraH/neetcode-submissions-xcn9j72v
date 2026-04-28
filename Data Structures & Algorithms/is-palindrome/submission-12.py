class Solution:
    def isPalindrome(self, s: str) -> bool:
        left = 0
        right = len(s) - 1


        while left < right:
            current_left = s[left]
            current_right = s[right]

            if not current_left.isalpha() and not current_left.isdigit():
                left += 1
                continue
            
            
            if not current_right.isalpha() and not current_right.isdigit():
                right -= 1
                continue
            

            if current_right.lower() != current_left.lower():
                return False

            left += 1
            right -= 1
        
        return True