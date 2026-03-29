class Solution {
    public int maxArea(int[] heights) {
       int left = 0;
       int right = heights.length - 1;

       int maxArea = Integer.MIN_VALUE;

       while(left < right){
        int minValue = Math.min(heights[left], heights[right]);
        int distance = Math.abs(left - right);
        maxArea = Math.max((minValue * distance), maxArea);


        if(heights[left] < heights[right]){
            left++;
        }else if(heights[left] > heights[right]){
            right--;
        }else {
            left++;
            right--;
        }
       }

       return maxArea; 
    }
}
