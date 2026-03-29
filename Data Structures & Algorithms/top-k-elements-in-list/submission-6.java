class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        Map<Integer, Integer> map = new HashMap<>();

        for(int current: nums){
            map.put(current, map.getOrDefault(current, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> current: map.entrySet()){
           pq.offer(current); 
        }

        int [] result = new int [k];

        for(int i = 0; i < result.length && !pq.isEmpty(); i++){
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}
