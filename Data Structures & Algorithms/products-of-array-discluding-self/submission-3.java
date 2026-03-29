class Solution {
    public int[] productExceptSelf(int[] nums) {
       int [] left = new int [nums.length];
       int [] right = new int [nums.length];
       int [] result = new int [nums.length];

       int start = 1;

       for(int i = 0; i < nums.length; i++){
         left[i] = start;
         start = start * nums[i];
       } 

       start = 1;

       for(int i = nums.length - 1; i >= 0; i--){
          right[i] = start;
          start = start * nums[i];
       }

       for(int i = 0; i < left.length; i++){
           result[i] = left[i] * right[i];
       }

       return result;
    }
}  
