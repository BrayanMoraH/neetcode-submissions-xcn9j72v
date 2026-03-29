class Solution {
    public int evalRPN(String[] tokens) {
        //stack=[9, 4]
        // 4 - 9
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens){
            
            if(token.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(token.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if(token.equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 / num1);
            }else if(token.equals("-")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            }else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
        
    }
}
