class Solution {
    public int[] productExceptSelf(int[] nums) {
       int value = 1;
       int [] left = new int [nums.length];
       int [] right = new int [nums.length];

       for(int i = 0; i < nums.length; i++){
        left[i] = value;
        value *= nums[i];
       }

       value = 1;

       for(int i = nums.length - 1; i >= 0; i--){
        right[i] = value;
        value *= nums[i];
       }

       int [] result = new int [nums.length];

       for(int i = 0; i < nums.length; i++){
        result[i] = right[i] * left[i];
       }

       return result;

    }
}  
