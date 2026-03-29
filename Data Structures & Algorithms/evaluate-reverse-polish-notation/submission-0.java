class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for(String token: tokens){
            if(token.equals("+") || token.equals("*") || token.equals("/") || token.equals("-")){
                if(token.equals("+")){
                   int secondNumber = numbers.pop();
                   int firstNumber = numbers.pop();
                   numbers.push(firstNumber  + secondNumber);  
                }else if(token.equals("*")){
                   int secondNumber = numbers.pop();
                   int firstNumber = numbers.pop();
                   numbers.push(firstNumber  * secondNumber);  
                }else if(token.equals("/")){
                   int secondNumber = numbers.pop();
                   int firstNumber = numbers.pop();
                   numbers.push(firstNumber  / secondNumber); 
                }else {
                   int secondNumber = numbers.pop();
                   int firstNumber = numbers.pop();
                   numbers.push(firstNumber  - secondNumber); 
                }
            }else {
                numbers.push(Integer.valueOf(token));
            }
        }

        return numbers.peek();
    }
}
