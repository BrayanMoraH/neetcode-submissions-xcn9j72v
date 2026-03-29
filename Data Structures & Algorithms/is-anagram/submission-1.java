class Solution {
    public boolean isAnagram(String s, String t) {
        char [] sOrder = s.toCharArray();
        Arrays.sort(sOrder);
        char [] tOrder = t.toCharArray();
        Arrays.sort(tOrder);

        return Arrays.equals(sOrder, tOrder); 
    }
}