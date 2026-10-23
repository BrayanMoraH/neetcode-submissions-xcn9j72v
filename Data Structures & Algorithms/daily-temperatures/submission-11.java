class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int [] result = new int [temperatures.length];

        stack.push(0);

        for(int i = 1; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int currentIndex = stack.pop();
                result[currentIndex] = i - currentIndex;
            }

            stack.push(i);
        }

        return result;
    }
}
