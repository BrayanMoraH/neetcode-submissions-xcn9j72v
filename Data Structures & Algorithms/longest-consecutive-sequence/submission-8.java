class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> seen = new HashSet<>();

        for(int num: nums){
            seen.add(num);
        }

        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            int counter = 1;

            
                while(seen.contains(current - 1)){
                    counter++;
                    current = current - 1;
                }
                
            

            result = Math.max(result, counter);
        }

        return result;

    }
}
