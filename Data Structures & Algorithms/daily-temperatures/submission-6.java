class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // [30,38,30,36,35,40,28]
        //     i
        // [0, ]
        // 0
        //[0, 0]

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int [] result = new int [temperatures.length];
        

        for(int i = 1; i < temperatures.length; i++){
           int counter = 0;

           while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
            int index = stack.pop();
            result[index] = i - index;
           }

            stack.push(i);
        }

        return result;
    }
}
