class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;

        while(left <= right){
            int middle = (left + right) / 2;

            System.out.println(middle);
            int [] current = matrix[middle];

            if(current[current.length -1] < target){
                left = middle + 1;
            }else if(current[0] > target){
                right = middle - 1;
            }else {
                for(int num: current){
                    System.out.println(num);
                }
                return binarySearch(current, target);
            }
        }

        return false;
    }

    public boolean binarySearch(int [] nums, int target){
        int left = 0;
        int right = nums.length - 1;


        while(left <= right){
            int middle = (left + right) / 2;

            if(target > nums[middle]){
                left = middle + 1;
            }else if(target < nums[middle]) {
                right = middle - 1;
            }else {
                return true;
            }
        }

        return false;
    }
}
