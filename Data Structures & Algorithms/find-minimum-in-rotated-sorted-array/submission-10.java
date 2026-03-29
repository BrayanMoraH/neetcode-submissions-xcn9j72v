class Solution {
    public int findMin(int[] nums) {
       int minValue = Integer.MAX_VALUE;

       int left = 0;
       int right = nums.length -1;

       while(left <= right){
        int middle = (left + right) / 2;

        if(nums[left] < nums[middle] && nums[middle] < nums[right]){
           minValue =  Math.min(nums[left], minValue);
        }else if(nums[left] > nums[right] && nums[middle] > nums[right]) {
            minValue = Math.min(nums[right], minValue);
        }

        minValue = Math.min(minValue, nums[middle]);

        if(nums[middle] > nums[left]){
            left = middle + 1;
        }else {
            right = middle -1;
        }
       }

       return minValue;
    }
}
