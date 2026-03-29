class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        List<int []> numbers = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){
            if(target >= matrix[i][0] && target <= matrix[i][matrix[i].length -1]){
                //apply binary search
                return binarySearch(matrix[i], target);
            }
        }

        return false;
    }

    public boolean binarySearch(int [] nums, int target){
        int left = 0;
        int right = nums.length -1;

        while(left <= right){
            int middle = (left + right) / 2;

            if(nums[middle] == target){
                return true;
            }else if(nums[middle] < target){
                left = middle + 1;
            }else {
                right = middle -1;
            }
        }

        return false;
    }
}
