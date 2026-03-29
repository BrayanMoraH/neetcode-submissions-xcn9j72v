class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int minValue = Integer.MAX_VALUE;

        while(left <= right){
            int middle = (left + right) / 2;

            if(nums[left] < nums[right] && nums[left] < minValue) return nums[left];

            minValue = Math.min(minValue, nums[middle]);

            if(nums[left] <= nums[middle]){
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }

        return minValue;
    }
}
