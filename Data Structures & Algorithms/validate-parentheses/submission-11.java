class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put(')', '(');
        parentheses.put('}', '{');
        parentheses.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for(char current : s.toCharArray()){
            if(current == '(' || current == '{' || current == '['){
                stack.push(current);
            }else if(stack.isEmpty()){
                return false;
            }else if(parentheses.get(current) != stack.peek()){
                return false;
            }else {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
