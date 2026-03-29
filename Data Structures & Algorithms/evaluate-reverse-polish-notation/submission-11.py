class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []

        for token in tokens:
            if token == '+':
                stack.append(stack.pop() + stack.pop())
            elif token == '-':
                value1 = stack.pop()
                value2 = stack.pop()
                stack.append(value2 - value1)
            elif token == '*':
                stack.append(stack.pop() * stack.pop())
            elif token == '/':
                value1 = stack.pop()
                value2 = stack.pop()
                stack.append(int (value2 / value1))
            else:
                stack.append(int(token))
        return stack[-1]

