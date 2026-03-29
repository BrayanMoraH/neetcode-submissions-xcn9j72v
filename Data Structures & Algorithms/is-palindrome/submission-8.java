class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            char currentLeft = Character.toLowerCase(s.charAt(left));
            char currentRight = Character.toLowerCase(s.charAt(right));

            if(!Character.isLetter(currentLeft) && !Character.isDigit(currentLeft)){
                left++;
                continue;
            }

            if(!Character.isLetter(currentRight) && !Character.isDigit(currentRight)){
                right--;
                continue;
            }

            if(currentLeft != currentRight){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
