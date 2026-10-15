class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            while(left < right && !Character.isLetter(s.charAt(left)) && !Character.isDigit(s.charAt(left))){
                left++;
            }

            while(left < right && !Character.isLetter(s.charAt(right)) && !Character.isDigit(s.charAt(right))){
                right--;
            }
            char currentLeft = Character.toLowerCase(s.charAt(left));
            char currentRight = Character.toLowerCase(s.charAt(right));


            if(currentLeft != currentRight){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
