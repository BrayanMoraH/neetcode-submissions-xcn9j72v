class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i = 0; i < matrix.length; i++){
            int [] currentArray = matrix[i];

            if(target >= currentArray[0] && target <= currentArray[currentArray.length - 1]){
                return binarySearch(currentArray, target);
            }
        }

        return false;
    }

    public boolean binarySearch(int [] currentArray, int target){
        int left = 0;
        int right = currentArray.length - 1;

        while(left <= right){
            int middle = (left + right) / 2;

            if(currentArray[middle] == target) return true;

            if(currentArray[middle] > target){
                right = middle - 1;
            }else if(currentArray[middle] < target){
                left = middle + 1;
            }
        } 

        return false;
    }


}
