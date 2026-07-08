class MinStack:

    def __init__(self):
        self.min_stack = []
        self.stack = []
        
    def push(self, val: int) -> None:
        self.stack.append(val)

        if len(self.min_stack) == 0:
            self.min_stack.append(val)
        elif self.min_stack[-1] >= val:
            self.min_stack.append(val)
        

    def pop(self) -> None:
        value_popped = self.stack.pop()

        if self.min_stack[-1] == value_popped:
            self.min_stack.pop()


    def top(self) -> int:
        return self.stack[-1]
        

    def getMin(self) -> int:
        return self.min_stack[-1]
        
