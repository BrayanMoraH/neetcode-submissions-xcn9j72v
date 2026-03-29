class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxValue = 0;

        for(int num: nums){
            set.add(num);
        }

        for(int current: set){

            int sum = 1;
            
            if(!set.contains(current -1)){
                int value = current + 1;

                while(set.contains(value)){
                    value++;
                    sum++;
                }
            }

            maxValue = Math.max(maxValue, sum);
        }

        return maxValue;
    }
}
