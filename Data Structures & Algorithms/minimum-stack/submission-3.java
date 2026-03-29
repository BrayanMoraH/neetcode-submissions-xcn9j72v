class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
            return;
        }

        if(val <= minStack.peek()){
            minStack.push(val);
        }


    }
    
    public void pop() {
        int current = stack.pop();

        if(!minStack.isEmpty() && minStack.peek() == current){
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
