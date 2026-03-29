class Solution {
    public int lengthOfLongestSubstring(String s) {
        //set = xy
        //zxyzxyz
        // l
        //   r  

        if(s.length() == 1) return 1;

        Set<Character> seen = new HashSet<>();
        int left = 0;
        int right = 0;
        int result = 0;

        while(right <= s.length() - 1){
            char current = s.charAt(right);

            while(seen.contains(current)){
                char leftValue = s.charAt(left);
                seen.remove(leftValue);
                left++;
            }

            result = Math.max(result, right - left + 1);

            seen.add(current);
            right++;
        }

       //result = Math.max(result, right - left + 1);

        return result;
    }
}
