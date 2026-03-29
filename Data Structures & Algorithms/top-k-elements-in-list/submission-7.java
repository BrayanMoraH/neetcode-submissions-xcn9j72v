class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> frequency = new HashMap<>();
       PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

       for(int i = 0; i < nums.length; i++){
        frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
       }


       for(Map.Entry<Integer, Integer> current: frequency.entrySet()){
        pq.add(current);
       }

       int [] result = new int [k];

       for(int i = 0; i < result.length && !pq.isEmpty(); i++){
        result[i] = pq.poll().getKey();
       }

       return result;

    }
}
