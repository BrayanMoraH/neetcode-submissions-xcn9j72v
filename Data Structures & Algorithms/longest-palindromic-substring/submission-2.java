class Solution {
    public String longestPalindrome(String s) {
        
        int leftLength = 0;
        int righLength = 0;

        if(s.length() == 1){
            return s;
        }

        for(int i = 0; i < s.length(); i++){
            int l = i;
            int r = i;

            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r - l + 1 > righLength){
                    leftLength = l;
                    righLength = r - 1 + 1;
                }

                l--;
                r++;
            }

            l = i;
            r = i +  1;


            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r - l + 1 > righLength){
                    leftLength = l;
                    righLength = r - 1 + 1;
                }
                l--;
                r++;
            }
        }

        return s.substring(leftLength, righLength + 1);
    }
}
