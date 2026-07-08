class Solution:
    def isValid(self, s: str) -> bool:
        pairs = []
        parentheses = {}

        parentheses[")"] = "("
        parentheses["}"] = "{"
        parentheses["]"] = "["


        for current in s:
            if(current == "(" or current == "[" or current == "{"):
                pairs.append(current)
            elif len(pairs) == 0:
                return False
            elif pairs[-1] != parentheses.get(current):
                return False
            else:
                pairs.pop()
        
        return len(pairs) == 0