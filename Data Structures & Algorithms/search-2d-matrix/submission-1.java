class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int [] current: matrix){
            if(target >= current[0] &&  target <= current[current.length - 1]){
                return isInArray(current, target);
            }
        }

        return false;
    }

    public boolean isInArray(int [] numbers, int target){
        int left = 0;
        int right = numbers.length - 1;

        while(left <= right){
            int middle = (left + right) / 2;

            if(numbers[middle] == target){
                return true;
            }

            if(numbers[middle] < target){
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }

        return false;
    }
}
