class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int result = 0;

        for(int num: nums){
            seen.add(num);
        }

        for(int num: seen){
            int currentSum = 1;

            if(!seen.contains(num - 1)){
                while(seen.contains(num + 1)){
                    currentSum++;
                    num++;
                }
            }

            result = Math.max(currentSum, result);

        }

        return result;
    }
}
