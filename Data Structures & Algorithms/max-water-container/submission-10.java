class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxValue = 0;

        while(left < right){
            int distance = Math.abs(left - right);
            int minValue = Math.min(heights[left], heights[right]);
            maxValue =  Math.max(maxValue, distance * minValue);

            if(heights[left] <= heights[right]){
                left++;
            }else {
                right--;
            }
        }

        return maxValue;
    }
}
