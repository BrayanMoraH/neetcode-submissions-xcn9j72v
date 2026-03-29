class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<int []> sorted = new ArrayList<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> current: map.entrySet()){
            sorted.add(new int []{current.getValue(), current.getKey()});
        }

        sorted.sort((a, b) -> b[0] - a[0]);

        int [] result = new int [k];

        for(int i = 0; i < k; i++){
            result[i] = sorted.get(i)[1];
        }

        return result;
    }
}
