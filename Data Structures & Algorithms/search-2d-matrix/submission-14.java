class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        //[[1, 2, 4, 8], [10, 11, 12, 13], [14, 20, 30, 40]]

        List<int []> nums = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){
            nums.add(matrix[i]);
        }

        int left = 0;
        int right = nums.size() -1;

        while(left <= right){
            int middle = (left + right) / 2;
            int [] current = nums.get(middle);

            if(target >= current[0] && target <= current[current.length -1]){
                return binarySearch(current, target);
            }else if(target > current[current.length -1]){
                left = middle + 1;
            }else {
                right = middle -1;
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
                right = middle - 1;
            }
        }

        return false;
    }
}
