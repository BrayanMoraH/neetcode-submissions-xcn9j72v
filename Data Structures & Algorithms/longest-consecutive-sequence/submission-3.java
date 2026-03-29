class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        int maxValue = Integer.MIN_VALUE;
        for(Integer num: nums){
            numbers.add(num);
        }

        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            int prev = current;
            int counter = 1;

            if(numbers.contains(prev - 1)){
                while(numbers.contains(prev - 1)){
                    counter++;
                    prev = prev - 1;
                }
            }

            maxValue = Math.max(maxValue, counter);
        }

        if(maxValue == Integer.MIN_VALUE) return 0;

        return maxValue;
    }
}
