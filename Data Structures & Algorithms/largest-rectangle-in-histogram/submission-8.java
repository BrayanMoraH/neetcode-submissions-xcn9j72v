class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int []> stack = new Stack<>();
        int maxValue = 0;

        for(int i = 0; i < heights.length; i++){
            if(stack.isEmpty()){
                stack.push(new int []{i, heights[i]});
                continue;
            }
            int index = i;

            while(!stack.isEmpty() && heights[i] < stack.peek()[1]){
                int [] current = stack.pop();
                int distance = (i - current[0]);
                index = current[0];
                maxValue = Math.max(maxValue, distance * current[1]);
            }

            stack.push(new int []{index, heights[i]});
        }

        int maxLength = heights.length;

        while(!stack.isEmpty()){
            int [] current  = stack.pop();
            int distance = maxLength - current[0];
            maxValue = Math.max(maxValue, current[1] * distance);
        }

        return maxValue;
    }
}
