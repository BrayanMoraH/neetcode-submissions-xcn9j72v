class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String current: strs){
            char [] sortedArray = current.toCharArray();
            Arrays.sort(sortedArray);
            String sorted = new String(sortedArray);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<String>());
            }

            map.get(sorted).add(current);
        } 

        result.addAll(map.values());

        return result;

    }
}
