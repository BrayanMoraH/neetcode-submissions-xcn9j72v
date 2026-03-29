class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> [] frequency = new List[nums.length + 1];
        Map<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i < frequency.length; i++){
            frequency[i] = new ArrayList<>();
        }

        for(int i = 0; i < nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }


        for(Map.Entry<Integer, Integer> current: count.entrySet()){
            //System.out.println("value:" + current.getValue() + " Key:" + current.getKey());
            frequency[current.getValue()].add(current.getKey());
        }

        int index = 0;
        int [] result = new int [k];

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
