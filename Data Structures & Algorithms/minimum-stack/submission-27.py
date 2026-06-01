class MinStack:

    def __init__(self):
        self.min_stack = []
        self.stack = []


    def push(self, val: int) -> None:

        self.stack.append(val)

        if len(self.min_stack) == 0:
            self.min_stack.append(val)
        elif val <= self.min_stack[-1]:
            self.min_stack.append(val)
        

    def pop(self) -> None:
        value_deleted = self.stack.pop()

        if value_deleted == self.min_stack[-1]:
            self.min_stack.pop()

    def top(self) -> int:
        return self.stack[-1]
        

    def getMin(self) -> int:
        return self.min_stack[-1]
        
