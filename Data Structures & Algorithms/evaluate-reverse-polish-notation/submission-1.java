class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> current = new Stack<>();
        for(String token: tokens){
            if(token.equals("*")){
                int number1 = current.pop();
                int number2 = current.pop();

                current.push(number1*number2);
            }else if(token.equals("+")){
                int number1 = current.pop();
                int number2 = current.pop();

                current.push(number1 + number2);
            }else if(token.equals("-")){
                int number1 = current.pop();
                int number2 = current.pop();

                current.push(number2 - number1);
            }else if(token.equals("/")){
                int number1 = current.pop();
                int number2 = current.pop();

                current.push(number2 / number1);
            }else {
                current.push(Integer.valueOf(token));
            }
        }

        return current.peek();
    }
}
