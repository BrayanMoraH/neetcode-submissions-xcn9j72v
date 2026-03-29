class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        if(!minStack.isEmpty() && val <= minStack.peek()){
            minStack.push(val);
            return;
        }else if(minStack.isEmpty()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        Integer number = stack.pop();
        if(number.equals(minStack.peek())){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
