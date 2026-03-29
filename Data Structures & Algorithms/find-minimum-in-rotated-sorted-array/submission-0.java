class Solution {
    public int findMin(int[] nums) {
        int minValue = Integer.MAX_VALUE;

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){

            if(nums[left] < nums[right]){
                minValue = Math.min(minValue, nums[left]);
                break;
            }

            int middle = (left + right) / 2;

            minValue =  Math.min(nums[middle], minValue);

            if(nums[left] <= nums[middle]){
                left = middle + 1;
            }else {
                right = middle - 1;
            }

        }

        return minValue;
    }
}
