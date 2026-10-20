class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> values = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        values.put(')', '(');
        values.put('}', '{');
        values.put(']', '[');


        for(char current: s.toCharArray()){
            if(current == '(' || current == '{' || current == '['){
                stack.push(current);
            }else if(stack.isEmpty()){
                return false;
            }else if(stack.peek() != values.get(current)){
                return false;
            }else {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
