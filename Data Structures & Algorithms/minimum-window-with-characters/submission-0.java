class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> countChar = new HashMap<>();

        for(char current: t.toCharArray()){
            countChar.put(current, countChar.getOrDefault(current, 0) + 1);
        }

        int [] minWindow = {0, Integer.MAX_VALUE};
        int remainChar = t.length();
        int startIndex = 0;

        for(int endIndex = 0; endIndex < s.length(); endIndex++){
            char currentChar = s.charAt(endIndex);

            if(countChar.containsKey(currentChar) && countChar.get(currentChar) > 0){
                remainChar--;
            }

            countChar.put(currentChar, countChar.getOrDefault(currentChar, 0) - 1);

            if(remainChar == 0){
                while(true){
                    char charAtStart = s.charAt(startIndex);

                    if(countChar.containsKey(charAtStart) && countChar.get(charAtStart) == 0){
                        break;
                    }

                    countChar.put(charAtStart, countChar.getOrDefault(charAtStart, 0) + 1);
                    startIndex++;
                }

                if(endIndex - startIndex < minWindow[1] - minWindow[0]){
                    minWindow = new int [] {startIndex, endIndex};
                }

                countChar.put(s.charAt(startIndex), countChar.getOrDefault(startIndex, 0) + 1);
                remainChar++;
                startIndex++;
            }
        }

        if(minWindow[1] == Integer.MAX_VALUE) return "";

        return s.substring(minWindow[0], minWindow[1] + 1);
    }
}
