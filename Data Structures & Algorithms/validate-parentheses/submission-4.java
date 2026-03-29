class Solution {
    public boolean isValid(String s) {
         Stack<Character> open = new Stack<>();
         Map<Character, Character> map = new HashMap<>();

         map.put(')', '(');
         map.put(']', '[');
         map.put('}', '{');

         for(char current: s.toCharArray()){
            if(current == '(' || current == '['|| current == '{'){
                open.push(current);
            }else {
                if(open.isEmpty()) return false;

                if(map.get(current) != open.peek()) return false;

                open.pop();
            }
         }


         return open.isEmpty();
    }
}
