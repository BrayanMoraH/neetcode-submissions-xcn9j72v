class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int result = Integer.MIN_VALUE;

        while(left <= right){
            int minVal = Math.min(heights[left], heights[right]);
            int distance = Math.abs(left  -  right);

            result = Math.max(result, minVal * distance);

            if(heights[left] <= heights[right]){
                left++;
            }else {
                right--;
            }
        }

        return result;
    }
}
