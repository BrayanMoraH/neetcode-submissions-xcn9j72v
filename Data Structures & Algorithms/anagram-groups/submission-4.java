class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> visited = new HashMap<>();


        for(int i = 0; i < strs.length; i++){
            String currentWord = strs[i];
            char [] word = currentWord.toCharArray();
            Arrays.sort(word);
            String sortedWord = new String(word);

            if(!visited.containsKey(sortedWord)){
                visited.put(sortedWord, new ArrayList<>());
            }

            visited.get(sortedWord).add(currentWord);
        }

        result.addAll(visited.values());
        return result;
    }
}
