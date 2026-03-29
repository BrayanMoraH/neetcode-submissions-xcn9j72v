class MinStack {
    Stack<Integer> normalStack;
    Stack<Integer> minStack;
    public MinStack() {
        normalStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        normalStack.push(val);

        if(!minStack.isEmpty() && minStack.peek() >= val){
            minStack.push(val);
        }else if(minStack.isEmpty()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int valueRemoved = normalStack.pop();

        if(!minStack.isEmpty() && minStack.peek() == valueRemoved){
            minStack.pop();
        }
    }
    
    public int top() {
        return normalStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
