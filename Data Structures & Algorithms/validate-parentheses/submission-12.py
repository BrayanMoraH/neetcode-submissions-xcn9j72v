class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        values = {}
        open_p = '({['

        values[')'] = '('
        values['}'] = '{'
        values[']'] = '['

        for value in s:
            if value in open_p:
                print("here!!!")
                stack.append(value)
            
            elif len(stack) == 0:
                return False
            elif len(stack) != 0 and values.get(value) != stack[-1]:
                return False
            else:
                stack.pop()
        
        return len(stack) == 0



