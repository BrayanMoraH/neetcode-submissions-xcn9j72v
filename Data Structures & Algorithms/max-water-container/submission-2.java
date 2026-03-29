class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxWater = Integer.MIN_VALUE;

        while(left < right){
            int minVal = Math.min(heights[left], heights[right]);
            int distance = right - left;

            maxWater = Math.max(maxWater, (minVal * distance));

            if(heights[left] <= heights[right]){
                left++;
            }else {
                right--;
            }
        }

        return maxWater;
    }
}
