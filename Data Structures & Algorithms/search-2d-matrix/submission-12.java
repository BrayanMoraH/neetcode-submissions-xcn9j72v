class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW_LENGTH = matrix.length;
        int COL_LENGTH = matrix[0].length;

        int left = 0;
        int right = (ROW_LENGTH * COL_LENGTH) - 1;

        System.out.println("right value: " + right);

        while(left <= right){
            int middle = (left + right) / 2;
            int row = middle / COL_LENGTH;
            int col = middle % COL_LENGTH;

            if(matrix[row][col] > target){
                right--;
            }else if(matrix[row][col] < target){
                left++;
            }else {
                return true;
            }
        }

        return false;
    }
}
