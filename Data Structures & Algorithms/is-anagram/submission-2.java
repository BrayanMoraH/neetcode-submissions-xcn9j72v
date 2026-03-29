class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(char current: s.toCharArray()){
            sMap.put(current, sMap.getOrDefault(current, 0) + 1);
        }

        for(char current: t.toCharArray()){
            tMap.put(current, tMap.getOrDefault(current, 0) + 1);
        }

        return sMap.equals(tMap);

        
    }
}
