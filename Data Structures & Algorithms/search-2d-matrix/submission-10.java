class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            int [] current = matrix[i];
            if(target >= current[0] && target <= current[current.length -1]){
                return isValueInArray(current, target);
            }
        }

        return false;
    }

    public boolean isValueInArray(int [] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int middle = (left + right) / 2;

            if(nums[middle] > target){
                right = middle -1;
            }else if(nums[middle] < target){
                left = middle + 1;
            }else {
                return true;
            }
        }

        return false;
    }
}
