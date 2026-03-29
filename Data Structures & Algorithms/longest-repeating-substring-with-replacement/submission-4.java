class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;

        char frequent = s.charAt(0);
        int maxValue = Integer.MIN_VALUE;

        while(right < s.length()){
            char current = s.charAt(right);
            map.put(current, map.getOrDefault(current, 0) + 1);

            if(map.get(current) >= map.get(frequent)){
                frequent = current;
            }

            int result = ((right - left) + 1) - map.get(frequent);

            if(result > k){
                char leftValue = s.charAt(left);
                map.put(leftValue, map.get(leftValue) -1);
                left++;

                //Now we have to get rid of right beacuse prevously we add it

                map.put(current, map.get(current) -1);
            }else {
                maxValue = Math.max(maxValue, ((right - left) + 1));
                right++;
            } 
        }

        return maxValue;
    }
}
