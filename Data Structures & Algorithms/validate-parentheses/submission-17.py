class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        values = {}

        values[")"] = "("
        values["}"] = "{"
        values["]"] = "["

        for current in s:

            if current == "{" or current == "[" or current == "(":
                stack.append(current)
            elif not stack:
                return False
            elif stack[-1] != values.get(current):
                return False
            else:
                stack.pop()
        
        return not stack