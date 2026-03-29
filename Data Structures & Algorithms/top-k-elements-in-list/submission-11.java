class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> [] frequency = new List[nums.length + 1];
        Map<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i < frequency.length; i++){
            frequency[i] = new ArrayList<>();
        }

        for(int num: nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> current: count.entrySet()){
            System.out.println("Key: " + current.getKey() + " Value: " + current.getValue());
            frequency[current.getValue()].add(current.getKey());
        }

        int [] result = new int [k];
        int index = 0;

        for(int i = frequency.length - 1; i > 0; i--){
            for(int num: frequency[i]){
                result[index++] = num;

                if(index == k) return result;
            }

        }


        return result;
    }
}
