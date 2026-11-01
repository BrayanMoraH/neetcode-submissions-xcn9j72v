class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length -1;


        while(left <= right){
            int middle = (left + right) / 2;

            int [] current = matrix[middle];

            if(target > current[current.length - 1]){
                left = middle + 1;
            }else if(target < current[0]){
                right = middle - 1;
            }else {
                return backtrack(target, current);
            }
        }

        return false;
    }

    public boolean backtrack(int target, int [] numbers){
        int left = 0;
        int right = numbers.length -1;

        while(left <= right){
            int middle = (left + right) / 2;

            if(numbers[middle] > target){
                right = middle - 1;
            }else if(numbers[middle] < target){
                left = middle + 1;
            }else {
                return true;
            }
        }

        return false;
    }
}
