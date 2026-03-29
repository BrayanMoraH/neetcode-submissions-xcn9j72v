class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> visited = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for(int num: nums){
            visited.put(num, visited.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: visited.entrySet()){
            pq.add(entry);
        } 

        int [] result = new int [k];
        for(int i = 0; i < k && !pq.isEmpty(); i++){
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}
