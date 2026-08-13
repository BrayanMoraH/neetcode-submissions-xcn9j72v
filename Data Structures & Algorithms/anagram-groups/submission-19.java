class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String current: strs){
            char [] currentArray = current.toCharArray();

            Arrays.sort(currentArray);

            String currentSorted = new String(currentArray);

            if(!groups.containsKey(currentSorted)){
                groups.put(currentSorted, new ArrayList<>());
            }

            groups.get(currentSorted).add(current);
        }

        return new ArrayList<>(groups.values());
    }
}
