class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int result = target - nums[i];

            if(values.containsKey(result)){
                return new int [] {values.get(result), i};
            }

            values.put(nums[i], i);
        }

        return new int [] {-1, -1};
    }
}
