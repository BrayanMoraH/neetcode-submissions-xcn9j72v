class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()){
            System.out.println("here===");
            return false;
        }

        int [] s1Array = new int [26];
        int [] s2Array = new int [26];

        for(int i = 0; i < s1.length(); i++){
            s1Array[s1.charAt(i) - 'a'] += 1;
            s2Array[s2.charAt(i) - 'a'] += 1;
        }

        for(int i = s1.length(); i < s2.length(); i++){
            if(Arrays.equals(s1Array, s2Array)){
                return true;
            }

            s2Array[s2.charAt(i - s1.length()) - 'a'] -= 1;
            s2Array[s2.charAt(i) - 'a'] += 1;
        }

        return Arrays.equals(s1Array, s2Array);

    }
}
