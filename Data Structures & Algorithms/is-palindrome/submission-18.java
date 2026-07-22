class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            
            while(left < right && !Character.isDigit(s.charAt(left)) && !Character.isLetter(s.charAt(left))){
                left++;
            }

            while(right > 0 && !Character.isDigit(s.charAt(right)) && !Character.isLetter(s.charAt(right))){
                right--;
            }


            if(left < right && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                System.out.println(left);
                System.out.println(right);
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
