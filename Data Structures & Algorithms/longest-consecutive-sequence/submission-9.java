class Solution {
    public int longestConsecutive(int[] nums) {
        int maxValue = 0;
        Set<Integer> seen = new HashSet<>();
        
        for(int num: nums){
            seen.add(num);
        }

        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            int counter = 1;
            int value = current - 1;
            while(seen.contains(value)){
                counter += 1;
                value -= 1;
            }

            maxValue = Math.max(maxValue, counter);
        }

        return maxValue;
    }
}
