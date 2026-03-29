class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          int left = 0;
          int right = matrix.length -1;

          while(left <= right){
            int middle = (left + right) / 2;
            System.out.println(middle);
            int [] current = matrix[middle];

            if(target < current[0]){
                right--;
            }else if(target > current[current.length -1]){
                left++;
            }else {
                return isTargetInArray(current, target);
            }
          }
        
        return false;
    }

    public boolean isTargetInArray(int [] nums, int target){
        int left = 0;
        int right = nums.length -1;

        while(left <= right){
            int middle = (left + right) / 2;

            if(nums[middle] > target){
                right--;
            }else if(nums[middle] < target){
                left++;
            }else {
                return true;
            }
        }

        return false;
    }
}
