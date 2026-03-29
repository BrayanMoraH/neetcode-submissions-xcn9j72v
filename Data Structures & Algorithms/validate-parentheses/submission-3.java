class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> map = Map.of(
            '}', '{',
            ']', '[',
            ')', '('
        ); 

        for(char current: s.toCharArray()){
            if(current == '(' || current == '[' || current == '{'){
                stack.push(current);
            }else {
                if(stack.isEmpty()) return false;

                if(stack.peek() != map.get(current)) return false;
                stack.pop();
            }
            
        }

        return stack.isEmpty();
    }
}
