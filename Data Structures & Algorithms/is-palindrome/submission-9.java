class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            char leftLetter = Character.toLowerCase(s.charAt(left));
            char rightLetter = Character.toLowerCase(s.charAt(right));

            if(!Character.isLetter(leftLetter) && !Character.isDigit(leftLetter)){
                left++;
                continue;
            }

            if(!Character.isLetter(rightLetter) && !Character.isDigit(rightLetter)){
                right--;
                continue;
            }

            if(leftLetter != rightLetter){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
