class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        my_stack = []
        for token in tokens:
            if token == '+':
                my_stack.append(my_stack.pop() + my_stack.pop())
            elif token == '-':
                num1 = my_stack.pop()
                num2 = my_stack.pop()
                my_stack.append(num2 - num1)
            elif token == '*':
                my_stack.append(my_stack.pop() * my_stack.pop())
            elif token == '/':
                num1 = my_stack.pop()
                num2 = my_stack.pop()
                my_stack.append(int(num2 / num1))
            else:
                my_stack.append(int(token))
        
        return my_stack[-1]
