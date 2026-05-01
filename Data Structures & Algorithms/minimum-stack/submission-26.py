class MinStack:

    def __init__(self):
        self.min_stack = []
        self.my_stack = []
        

    def push(self, val: int) -> None:
        self.my_stack.append(val)

        if len(self.min_stack) == 0:
            self.min_stack.append(val)
        elif len(self.min_stack) != 0 and val <= self.min_stack[-1]:
            self.min_stack.append(val)
        

    def pop(self) -> None:
        value_deleted = self.my_stack.pop()

        if self.min_stack[-1] == value_deleted:
            self.min_stack.pop()
        

    def top(self) -> int:
        return self.my_stack[-1]
        

    def getMin(self) -> int:
        return self.min_stack[-1]
        
