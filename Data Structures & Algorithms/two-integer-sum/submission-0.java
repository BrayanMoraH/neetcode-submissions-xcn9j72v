class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visited = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int result = target - nums[i];

            if(visited.containsKey(result)){
                return new int [] {visited.get(result), i};
            }

            visited.put(nums[i], i);
        }

        return new int []{-1, -1};
    }
}
