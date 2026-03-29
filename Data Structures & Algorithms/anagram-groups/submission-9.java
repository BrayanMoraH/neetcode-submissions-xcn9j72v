class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String current: strs){
            char [] currentChar = current.toCharArray();
            Arrays.sort(currentChar);
            String orderCurrent = new String(currentChar);

            if(!groups.containsKey(orderCurrent)){
                groups.put(orderCurrent, new ArrayList<>());
            }

            groups.get(orderCurrent).add(current);
        } 

        for(Map.Entry<String, List<String>> map: groups.entrySet()){
            result.add(map.getValue());
        }
        
        return result;
    }
}
