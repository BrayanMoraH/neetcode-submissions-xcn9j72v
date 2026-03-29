class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int []> stack = new Stack<>();
        int maxValue = 0;

        for(int i = 0; i < heights.length; i++){
            int current = heights[i];
            int index = i; 
            while(!stack.isEmpty() && stack.peek()[1] > current){
                int [] pair = stack.pop();
                maxValue = Math.max(maxValue, pair[1] * (i - pair[0]));
                index = pair[0];
            }

            stack.push(new int []{index, current});
        }

        while(!stack.isEmpty()){
            int [] pair = stack.pop();
            maxValue = Math.max(maxValue, pair[1] * (heights.length - pair[0]));
        }

        return maxValue;
    }
}
