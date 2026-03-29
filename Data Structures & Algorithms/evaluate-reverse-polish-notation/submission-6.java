class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String current: tokens){
            if(current.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(current.equals("-")){
                int number1 = stack.pop();
                int number2 = stack.pop();
                stack.push(number2 - number1);
            }else if(current.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if(current.equals("/")){
                int number1 = stack.pop();
                int number2 = stack.pop();
                stack.push(number2 / number1);
            }else {
                stack.push(Integer.parseInt(current));
            }
        }

        return stack.peek();
    }
}
