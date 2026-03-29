class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        

        for(int i = 0; i < strs.length; i++){
            char [] current = strs[i].toCharArray();
            Arrays.sort(current);
            String currentSorted = new String(current);

            if(!map.containsKey(currentSorted)){
                map.put(currentSorted, new ArrayList<>());
            }

            map.get(currentSorted).add(strs[i]);

        }

        List<List<String>> result = new ArrayList<>();

        result.addAll(map.values());

        return result;
    }
}
