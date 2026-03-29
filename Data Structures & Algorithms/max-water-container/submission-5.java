class Solution {
    public int maxArea(int[] heights) {
       // [1,7,2,5,4,7,3,6]
       //    l           r

       int left = 0;
       int right = heights.length -1;
       int maxValue = 0;

       while(left < right){
          int distance = Math.abs(left - right);
          int minValue = Math.min(heights[left], heights[right]);
          int result = distance * minValue;

          if(heights[left] <= heights[right]){
            left++;
          }else {
            right--;
          }


          maxValue = Math.max(result, maxValue);
       }

       return maxValue;
    }
}
