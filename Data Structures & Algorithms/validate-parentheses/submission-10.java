class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(char current: s.toCharArray()){
            if(current == '(' || current == '{' || current == '['){
                stack.push(current);
            }else if((stack.isEmpty()) || (!stack.isEmpty() && stack.peek() != map.get(current))){
                return false;
            }else {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
