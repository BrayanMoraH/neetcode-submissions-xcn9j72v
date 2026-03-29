class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();
        int left = 0;
        int mostf = 0;
        int result = 0;

        for(int right = 0; right < s.length(); right++){
            char current = s.charAt(right);

            count.put(current, count.getOrDefault(current, 0) + 1);

            mostf = Math.max(mostf, count.get(current));


            while((right - left + 1) - mostf > k){
                char leftVal = s.charAt(left);
                count.put(leftVal, count.get(leftVal) - 1);
                left++;
            }


            result =  Math.max((right - left + 1), result);
        }

        return result;
    }
}
