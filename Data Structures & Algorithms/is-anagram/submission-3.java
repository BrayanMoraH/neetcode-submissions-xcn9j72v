class Solution {
    public boolean isAnagram(String s, String t) {
        int [] sArray = new int [26];
        int [] tArray = new int [26];

        for(char current: s.toCharArray()){
            sArray[current - 'a']++;
        }

        for(char current: t.toCharArray()){
            tArray[current - 'a']++;
        }

        return Arrays.equals(sArray, tArray);

    }
}
