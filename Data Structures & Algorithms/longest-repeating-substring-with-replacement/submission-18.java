class Solution {
    public int characterReplacement(String s, int k) {
        //most repeated = X -> 1, Y -> 2
        //0 1 2 3
        //X Y Y X  K = 2
        //l
        //    r

        Map<Character, Integer> values = new HashMap<>();

        int left = 0;
        int right = 0;
        int mostRepeated = 0;
        int result = 0; 

        while(right < s.length()){
            
            char current = s.charAt(right);
            values.put(current, values.getOrDefault(current, 0) + 1);

            mostRepeated = Math.max(values.get(current), mostRepeated);


            while((right - left + 1) - mostRepeated > k){
                char leftValue = s.charAt(left);
                values.put(leftValue, values.get(leftValue) -  1);
                left++;
            }

            result = Math.max((right - left + 1), result);
            right++;
        }

        return result;
    }
}
