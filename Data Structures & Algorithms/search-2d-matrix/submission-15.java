class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int [] flatted = Arrays.stream(matrix).flatMapToInt(Arrays::stream).toArray();

        int left = 0;
        int right = flatted.length -1;

        while(left  <= right){
            int middle = (left + right) / 2;

            if(flatted[middle] > target){
                right--;
            }else if(flatted[middle] < target){
                left++;
            }else {
                return true;
            }
        }

        return false;
    }
}
