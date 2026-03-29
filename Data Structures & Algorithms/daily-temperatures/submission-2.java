class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> myStack = new Stack<>();
        int [] result = new int [temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            if(i == 0){
                myStack.push(i);
                continue;
            }

            while(!myStack.isEmpty() && temperatures[i] > temperatures[myStack.peek()]){
                int distance = i - myStack.peek();
                result[myStack.peek()] = distance;
                myStack.pop();
            }

            myStack.push(i);
        }

        return result;

    }
}
