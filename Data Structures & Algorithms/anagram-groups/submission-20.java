class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String current: strs){
            char [] currentArray = current.toCharArray();
            Arrays.sort(currentArray);

            String currentSorted = new String(currentArray);

            if(!map.containsKey(currentSorted)){
                map.put(currentSorted, new ArrayList<>());
            }

            map.get(currentSorted).add(current);
        }

        List<List<String>> result = new ArrayList<>();
        result.addAll(map.values());

        return result;
    }
}
