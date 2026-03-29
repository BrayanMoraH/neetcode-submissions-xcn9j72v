class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> [] frequency = new List[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < frequency.length; i++){
            frequency[i] = new ArrayList<>();
        }

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> current: map.entrySet()){
            frequency[current.getValue()].add(current.getKey());
        }

        int index = 0;
        int [] result = new int [k];

        for(int i = frequency.length - 1; i > 0 && index <= k; i--){
            for(int n: frequency[i]){
                result[index] = n;
                index++;

                if(index == k){
                    return result;
                }
            }
        }

        return result;

    }
}
