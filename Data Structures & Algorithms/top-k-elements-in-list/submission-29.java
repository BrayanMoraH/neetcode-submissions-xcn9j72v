class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int maxValue = nums.length;
        maxValue += 1;

        List<Integer> [] groups = new List[maxValue];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < groups.length; i++){
            groups[i] = new ArrayList<>();
        }

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> current: map.entrySet()){
            groups[current.getValue()].add(current.getKey());
        }

        int index = 0;
        int [] result = new int[k];

        for(int i = groups.length - 1; i > 0; i--){

            for(int num: groups[i]){
                result[index] = num;

                index++;
                k--;

                if(k == 0){
                    return result;
                }
            }
        }

        return result;

    }
}
