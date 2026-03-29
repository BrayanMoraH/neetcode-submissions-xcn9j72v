class Solution {
    public int lengthOfLongestSubstring(String s) {

       if(s.length() <= 0) return 0;


       int left = 0;
       int right = 1;

       List<Character> window = new ArrayList<>();
       int result = 1;

       window.add(s.charAt(left));

       while(right < s.length() && left <= right){
        char current = s.charAt(right);
        if(!window.contains(current)){
            window.add(current);
            right++;
        }else {
            result = Math.max(result, window.size());
            left++;
            window.remove(0);
        }
       }

       result = Math.max(result, window.size());

       return result;
        
    }
}
