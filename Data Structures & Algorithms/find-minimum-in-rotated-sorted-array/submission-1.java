class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int middle = (left + right) / 2;

            if(nums[left] <= nums[right]){
                return nums[left];
            }

            if(nums[left] <= nums[middle]){
                left = middle + 1;
            }else {
                right = middle;
            }
        }

        return -1;
    }
}
