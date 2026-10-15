class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int maxValue = 0;

        for(int num: nums){
            seen.add(num);
        }

        for(int num: seen){
            int currentSum = 1;

            if(!seen.contains(num - 1)){
                int temp = num;

                while(seen.contains(temp + 1)){
                    currentSum++;
                    temp++;
                }
            }

            maxValue = Math.max(maxValue, currentSum);
        }

        return maxValue;
    }
}
