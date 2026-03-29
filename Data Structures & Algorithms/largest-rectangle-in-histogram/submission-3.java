class Solution {
    public int largestRectangleArea(int[] heights) {
       Stack<int[]> stack = new Stack<>();
       int maxValue = Integer.MIN_VALUE;


       for(int i = 0; i < heights.length; i++){
          if(stack.isEmpty()){
            stack.add(new int[] {i, heights[i]});
            continue;
          }

          int current = heights[i];
          int currentIndex = i;
          while(!stack.isEmpty() && current <= stack.peek()[1]){
            int [] poppedArray = stack.pop();
            int distance = i - poppedArray[0];
            maxValue = Math.max((distance * poppedArray[1]), maxValue);
            currentIndex = poppedArray[0];
          }

          stack.add(new int[] {currentIndex, current});

       }

       int totalHeight = heights.length;

       while(!stack.isEmpty()){
            int [] poppedArray = stack.pop();
            int distance = totalHeight - poppedArray[0];
            maxValue = Math.max((distance *  poppedArray[1]), maxValue);
       } 

       return maxValue;
    }
}
