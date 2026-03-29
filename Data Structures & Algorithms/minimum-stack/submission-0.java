class MinStack {

    Stack<Integer> regularStack;
    Stack<Integer> minStack;

    public MinStack() {
        this.regularStack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        regularStack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
            return;
        }

        if(val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int numRemoved = regularStack.pop();
        if(minStack.peek() == numRemoved){
            minStack.pop();
        }
        
    }
    
    public int top() {
        return regularStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
