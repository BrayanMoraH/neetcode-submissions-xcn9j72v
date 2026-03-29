class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String, List<String>> groups = new HashMap<>();
     List<List<String>> result = new ArrayList<>();
     for(int i = 0; i < strs.length; i++){
        char [] current = strs[i].toCharArray();
        Arrays.sort(current);
        String currentSorted = new String(current);

        if(!groups.containsKey(currentSorted)){
            groups.put(currentSorted, new ArrayList<>());
        }

        groups.get(currentSorted).add(strs[i]);
     }

     result.addAll(groups.values());

     return result;

    }
}
