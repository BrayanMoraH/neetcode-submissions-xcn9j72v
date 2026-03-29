class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder reversed = new StringBuilder();
        StringBuilder normal = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                normal.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        for(int i = s.length() -1; i >=0; i--){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                reversed.append(Character.toLowerCase(s.charAt(i)));
            }
            
        }

        System.out.println(reversed.toString());
        System.out.println(normal.toString());
        return reversed.toString().equals(normal.toString());


    }
}
