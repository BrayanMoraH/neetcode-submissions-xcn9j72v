class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        values = []
        for token in tokens:
            if token == "+":
                values.append(values.pop() + values.pop())
            elif token == "-":
                value1 = values.pop()
                value2 = values.pop()
                values.append(value2 - value1)
            elif token == "*":
                values.append(values.pop() * values.pop())
            elif token == "/":
                value1 = values.pop()
                value2 = values.pop()
                values.append(int (value2 / value1))
            else:
                values.append(int(token))
        
        return values[-1]