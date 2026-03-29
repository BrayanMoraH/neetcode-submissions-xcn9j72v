class Solution {
    public int lengthOfLongestSubstring(String s) {
        //z x y z x y z
        //      l
        //            r

        List<Character> seen = new ArrayList<>();
        int result = Integer.MIN_VALUE;

        int left = 0;
        int right = 0;


        while(right < s.length()){
            while(seen.contains(s.charAt(right))){
                int indexToRemove = seen.indexOf(s.charAt(left));
                System.out.println(indexToRemove);
                seen.remove(indexToRemove);
                left++;
            }


            seen.add(s.charAt(right));
            result = Math.max(result, seen.size());
            right++;
        }

        if(result == Integer.MIN_VALUE){
            return 0;
        }

        return result;
    }
}
