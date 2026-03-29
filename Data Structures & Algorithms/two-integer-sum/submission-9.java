class Solution {
    public int[] twoSum(int[] nums, int target) {
        //7 -3 = 4  
        Map<Integer, Integer> values = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int current = target - nums[i];

            if(values.containsKey(current)){
                return new int []{values.get(current), i};
            }else {
                values.put(nums[i], i);
            }
        } 

        return new int []{-1, -1};
    }
}
