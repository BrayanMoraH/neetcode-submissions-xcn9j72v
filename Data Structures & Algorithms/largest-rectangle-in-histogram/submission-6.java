class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int []> stack = new Stack<>();
        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < heights.length;  i++){
            int [] current = new int [] {i, i, heights[i]};
            if(stack.isEmpty()){
                stack.push(current);
                continue;
            }

            while(!stack.isEmpty() && stack.peek()[2] >= heights[i]){
                int [] group = stack.pop();
                int currentHistogram = (current[1] - group[0]) * group[2];
                maxValue = Math.max(currentHistogram, maxValue);
                current[0] = group[0];
            }

            stack.push(current);
        }

        int totalLength = heights.length;


        while(!stack.isEmpty()){
            int [] current = stack.pop();
            int currentHistogram = (totalLength - current[0]) * current[2];
            maxValue = Math.max(maxValue, currentHistogram);
        }

        return maxValue;
    }
}
