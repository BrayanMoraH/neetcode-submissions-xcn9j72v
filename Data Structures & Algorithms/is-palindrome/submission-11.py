class Solution:
    def isPalindrome(self, s: str) -> bool:
        left = 0
        right = (len(s) - 1)

        while left < right:
            value_left = s[left].lower()
            value_right = s[right].lower()

            if not value_left.isalnum():
                left += 1
                continue
            
            if not value_right.isalnum():
                right -= 1
                continue
            

            if value_left != value_right:
                return False
            

            left += 1
            right -= 1

        
        return True




