class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        List<Integer>[] values = new List[nums.length + 1];

        for(int i = 0; i <= nums.length; i++){
            values[i] = new ArrayList<>();
        }

        for(int num : nums){
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> current: counter.entrySet()){
            values[current.getValue()].add(current.getKey());
        }

        int [] result = new int [k];
        int index = 0;

        System.out.println(values.length);

        for(int i = values.length - 1; i >= 0; i--){
           for(int value : values[i]){
             result[index] = value;
             index++;

             if(index == k){
                return result;
             }
           }
        }

        return result;

    }
}
