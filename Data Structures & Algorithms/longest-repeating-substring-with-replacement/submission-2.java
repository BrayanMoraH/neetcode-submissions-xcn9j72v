class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int mostFrequent = 0;
        int maxValue = 0;

        while(right < s.length()){
            char current = s.charAt(right);
            map.put(current, map.getOrDefault(current, 0) + 1);

            mostFrequent = Math.max(mostFrequent, map.get(current));

            int result = ((right - left) + 1) - mostFrequent;

            if(result > k){
                char leftValue = s.charAt(left);
                left++;
                map.put(leftValue, map.getOrDefault(leftValue, 0) -1);
                //map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
            }else {
                maxValue = Math.max(maxValue, (right - left) + 1);
                
            }

            right++;
        }

        return maxValue;
    }
}
