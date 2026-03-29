class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> [] frequency = new List[nums.length + 1];

        for(int i = 0; i < frequency.length; i++){
            frequency[i] = new ArrayList<>();
        }

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> current: map.entrySet()){
            frequency[current.getValue()].add(current.getKey());
        }

        int [] result = new int [k];
        int index = 0;

        for(int i = frequency.length - 1; i > 0; i--){
            for(int n: frequency[i]){
                result[index++] = n;

                if(index == k){
                    return result;
                }
            }
        }

        return result;
    }
}
