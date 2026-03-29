class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] first = new int [nums.length];
        int [] second = new int [nums.length];
        int [] result = new int [nums.length];
        int prev = 1;

        for(int i =0; i < first.length; i++){
            first[i] = prev;
            prev = prev * nums[i];
        }

        prev = 1;

        for(int i = second.length -1; i >= 0; i--){
            second[i] = prev;
            prev = prev * nums[i];
        }

        for(int i = 0; i < first.length; i++){
            result[i] = first[i] * second[i];
        }

        return result;
    }
}  
