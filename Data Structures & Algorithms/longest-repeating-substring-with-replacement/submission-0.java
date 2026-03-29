class Solution {
    public int characterReplacement(String s, int k) {
        int [] characters = new int [26];
        int max = 0;
        int left = 0;
        int result = 0;

        for(int right = 0; right < s.length(); right++){
            characters[s.charAt(right) - 'A']++;
            max = Math.max(max, characters[s.charAt(right) - 'A']);

            if(right - left + 1 - max > k){
                characters[s.charAt(left) - 'A']--;
                left++;
                continue;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
