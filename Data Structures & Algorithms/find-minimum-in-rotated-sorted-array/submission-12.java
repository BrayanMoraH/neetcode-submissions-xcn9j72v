class Solution {
    public int findMin(int[] nums) {
       int minValue = Integer.MAX_VALUE;

       int left = 0;
       int right = nums.length -1;

       while(left <= right){

        if(nums[left] < nums[right]){
            minValue = Math.min(minValue, nums[left]);
            break;
        }

        int middle = (left + right) / 2;

        minValue = Math.min(minValue, nums[middle]);

        if(nums[middle] >= nums[left]){
            left = middle + 1;
        }else {
            right = middle -1;
        }
       }

       return minValue;
    }
}
