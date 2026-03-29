class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(char current: s.toCharArray()){
            System.out.println(current);
            if(current == '(' || current == '[' || current == '{'){
                System.out.println("here");
                stack.push(current);
            }else if(stack.isEmpty()){
                return false;
            }else if(stack.peek() != map.get(current)){
                return false;
            }else {
                stack.pop();
            }
        }

        

        return stack.isEmpty();
    }
}
