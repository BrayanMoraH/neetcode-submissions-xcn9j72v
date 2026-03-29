class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] left = new int [nums.length];
        int [] right = new int [nums.length];
        int [] result = new int [nums.length];

        int current = 1;
        for(int i = 0; i < nums.length; i++){
            left[i] = current;
            current = current * nums[i];
        }

        current = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            right[i] = current;
            current = current * nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            result[i] = left[i] * right[i];
        }

        return result;
    }
}  
