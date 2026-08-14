class Solution {
    public int lengthOfLongestSubstring(String s) {
       List<Character> values = new ArrayList<>();
       int left = 0;
       int right = 0;
       int result = 0;

       while(right < s.length()){
         char current = s.charAt(right);
         while(values.contains(current)){
            char leftValue = s.charAt(left);
            values.remove(values.indexOf(leftValue));
            left++;
         }

         values.add(current);

         result = Math.max(result, values.size());
         right++;
       }

       return result; 
    }
}
