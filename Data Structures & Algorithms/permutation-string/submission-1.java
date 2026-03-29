class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;
        
        int [] s1Array = new int [26];
        int [] s2Array = new int [26];
        int s1Length = s1.length();


        for(char current: s1.toCharArray()){
            s1Array[current - 'a']++;
        }

        for(int i = 0; i < s1Length; i++){
            s2Array[s2.charAt(i) - 'a']++;
        }

        for(int i = s1Length; i < s2.length(); i++){
            if(Arrays.equals(s1Array, s2Array)) return true;

            s2Array[s2.charAt(i) - 'a']++;
            s2Array[s2.charAt(i - s1Length) - 'a']--;
        }


        return Arrays.equals(s1Array, s2Array);
    }
}
