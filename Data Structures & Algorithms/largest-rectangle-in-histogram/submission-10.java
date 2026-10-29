class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack();
        int n = heights.length;
        int maxValue = 0;

        for(int i = 0; i <= n; i++){

            while(!stack.isEmpty() && (i == n || heights[stack.peek()] >= heights[i])){
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxValue = Math.max(maxValue, height * width);
            }

            stack.push(i);
        } 

        return maxValue;
    }
}
