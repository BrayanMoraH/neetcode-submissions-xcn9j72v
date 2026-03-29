class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> [] frequency = new List[nums.length + 1];
        Map<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i < frequency.length; i++){
            frequency[i] = new ArrayList<>();
        }

        for(int current: nums){
            count.put(current, count.getOrDefault(current, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> current : count.entrySet()){
            frequency[current.getValue()].add(current.getKey());
        }

        int [] result = new int [k];
        int index = 0;

        for(int i = frequency.length -1; i > 0; i--){
            for(int c: frequency[i]){
                result[index++] = c;


                if(index == k){
                    return result;
                }  
            }
        }

        return result;
    }
}
