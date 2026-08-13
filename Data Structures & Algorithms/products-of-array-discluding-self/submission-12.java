class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] leftArray = new int [nums.length];
        int [] rightArray = new int [nums.length];
        int [] result = new int [nums.length];

        int value = 1;

        for(int i = 0; i < nums.length; i++){
            leftArray[i] = value;
            value *= nums[i];
        }

        value = 1;

        for(int i = nums.length -1; i >= 0; i--){
            rightArray[i] = value;
            value *= nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            result[i] = leftArray[i] * rightArray[i];
        }

        return result;
    }
}  
