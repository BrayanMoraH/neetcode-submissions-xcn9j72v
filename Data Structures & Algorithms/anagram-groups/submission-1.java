class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(int i = 0; i < strs.length; i++){
            char [] current = strs[i].toCharArray();
            Arrays.sort(current);
            String currentOrder = new String(current);
            if(!map.containsKey(currentOrder)){
                map.put(currentOrder, new ArrayList<>());
            }

            map.get(currentOrder).add(strs[i]);
        }

        for(Map.Entry<String, List<String>> mapElement: map.entrySet()){
            result.add(mapElement.getValue());
        }


        return result;



    }
}
