class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int left = 0;
        int right = 0;
        Set<Character> visited = new HashSet<>();

        while(right < s.length() && left <= right){
            while(visited.contains(s.charAt(right))){
                visited.remove(s.charAt(left));
                left++;
            }

            visited.add(s.charAt(right));
            result = Math.max(result, right - left + 1);
            right++;
        }

        return result;
    }
}
