class Solution {
    public int findMin(int[] nums) {
       //[3,4,5,6,1,2]
       //

       int left = 0;
       int right = nums.length - 1;
       int minValue = Integer.MAX_VALUE;

       while(left <= right){
        int middle = (left + right) / 2;

        if(nums[left] < nums[right]){
            minValue = Math.min(nums[left], minValue);
        }

        minValue = Math.min(minValue, nums[middle]);

        if(nums[middle] >= nums[left]){
            left = middle + 1;
        }else {
            right = middle - 1;
        }
       } 

       return minValue;
    }
}
