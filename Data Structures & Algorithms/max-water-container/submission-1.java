class Solution {
    public int maxArea(int[] heights) {
        int maxValue = Integer.MIN_VALUE;

        int left = 0;
        int right= heights.length -1;

        while(left < right){
            int minCurrent = Math.min(heights[left], heights[right]);
            int distance = Math.abs(left - right);
            System.out.print(distance);
            int currentResult = distance * minCurrent;

            maxValue = Math.max(currentResult, maxValue);

            if(heights[left] <= heights[right]){
                left++;
            }else {
                right--;
            }
        }

        return maxValue;
    }
}
