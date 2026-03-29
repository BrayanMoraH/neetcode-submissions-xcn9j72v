class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            char letterA = s.charAt(left);
            char letterB = s.charAt(right);
            
            if(!Character.isLetter(letterA) && !Character.isDigit(letterA)){
                left++;
                continue;
            }


            if(!Character.isLetter(letterB) && !Character.isDigit(letterB)){
                right--;
                continue;
            }

            if(Character.toLowerCase(letterA) != Character.toLowerCase(letterB)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
