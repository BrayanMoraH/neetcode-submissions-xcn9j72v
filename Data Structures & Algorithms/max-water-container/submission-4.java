class Solution {
    public int maxArea(int[] heights) {
        int left = 0; 
        int right = heights.length - 1;
        int maxValue = Integer.MIN_VALUE;

        while(left < right){
            int currentLeft = heights[left];
            int currentRight = heights[right];

            int minValue = currentLeft >= currentRight ? currentRight: currentLeft;
            int distance = right - left;

            maxValue = Math.max(maxValue, (minValue * distance));

            if(currentLeft <= currentRight){
                left++;
            }else {
                right--;
            }
        }

        return maxValue;
    }
}
