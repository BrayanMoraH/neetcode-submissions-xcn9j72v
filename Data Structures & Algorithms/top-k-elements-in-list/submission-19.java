class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> [] values = new ArrayList[nums.length + 1];

        for(int i = 0; i < values.length; i++){
            values[i] = new ArrayList<>();
        }

        for(int num: nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> current: count.entrySet()){
            values[current.getValue()].add(current.getKey());
        }

        int [] result = new int [k];
        int index = 0;

        for(int i = values.length -1; i >= 0; i--){
            for(int current: values[i]){
                result[index] = current;
                index++;

                if(index == k){
                    return result;
                } 
            }
        }

        return result;
    }
}
