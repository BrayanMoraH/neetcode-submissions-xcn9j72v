class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> characters = Map.of(
            ')', '(',
            ']', '[',
            '}', '{');

        Stack<Character> openCharacters = new Stack<>();


        for(char current: s.toCharArray()){
            if(current == '(' || current == '[' || current == '{'){
                openCharacters.add(current);
            }else {
                if(openCharacters.isEmpty()) return false;
                if(openCharacters.peek() != characters.get(current)) return false;
                openCharacters.pop();
            }
        }



        return openCharacters.isEmpty();

    }
}
