class Solution:
    def isValid(self, s: str) -> bool:
        my_stack = []
        p = {}

        p[')'] = '('
        p['}'] = '{'
        p[']'] = '['



        for value in s:
            if value == '[' or value == '{' or value == '(':
                my_stack.append(value)
            elif len(my_stack) == 0:
                return False
            elif p.get(value) != my_stack[-1]:
                return False
            else:
                my_stack.pop()
        
        return len(my_stack) == 0
