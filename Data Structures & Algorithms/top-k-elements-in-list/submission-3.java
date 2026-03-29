class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = 
        new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        int [] result = new int [k];

        for(int num: nums){
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        pq.addAll(counter.entrySet());

        for(int i = 0; i < result.length && !pq.isEmpty(); i++){
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}
