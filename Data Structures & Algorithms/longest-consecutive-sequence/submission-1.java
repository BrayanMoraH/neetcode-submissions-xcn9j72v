class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int counter = 0;
        int prev = Integer.MIN_VALUE;

        for(int num: nums){
            if(prev == Integer.MIN_VALUE){
                prev = num;
                counter++;
                continue;
            }

            if(num - prev == 1){
                counter++;
                prev = num;
            }else if(num - prev == 0) {
                prev = num;
            }else {
                max = Math.max(max, counter);
                prev = num;
                counter = 1;
            }
        }

        max = Math.max(max, counter);

        return max;
    }
}
