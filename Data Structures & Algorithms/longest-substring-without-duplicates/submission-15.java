class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> values = new ArrayList<>();
        int maxValue = 0;
        int left = 0;
        int right = 0;

        while(right < s.length()){
            if(values.size() == 0){
                values.add(s.charAt(right));
                right++;
                continue;
            }

            while(values.contains(s.charAt(right))){
                maxValue = Math.max(right - left, maxValue);
                values.remove(values.indexOf(s.charAt(left)));
                left++;
            }

            values.add(s.charAt(right));
            right++;
        }

        maxValue = Math.max(maxValue, values.size());

        return maxValue;
    }
}
