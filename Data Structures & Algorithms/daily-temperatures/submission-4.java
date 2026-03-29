class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //temperatures = [30,38,30,36,35,40,28]
        //                          i

        //stack=[1, 2, ]
        //[1, 0, 0, 0, 0, 0, 0]

        Stack<Integer> stack = new Stack<>();
        int [] result = new int [temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            if(stack.isEmpty()){
                stack.push(i);
                continue;
            }

            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int currentIndex = stack.pop();
                result[currentIndex] = Math.abs(currentIndex - i);
            }

            stack.push(i);
        }

        return result;
    }
}
