class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> visited = new HashMap<>();

        for(String current: strs){
            char [] currentAsArray = current.toCharArray();
            Arrays.sort(currentAsArray);
            String currentSorted = new String(currentAsArray);

            if(!visited.containsKey(currentSorted)){
                visited.put(currentSorted, new ArrayList<>());
            }

            visited.get(currentSorted).add(current);
        }

        result.addAll(visited.values());

        return result;
    }
}
