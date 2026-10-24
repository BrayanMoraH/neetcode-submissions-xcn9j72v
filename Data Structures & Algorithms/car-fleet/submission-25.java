class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();

        int [][] values = new int [position.length][2];

        for(int i = 0; i < position.length; i++){
            values[i][0] = position[i];
            values[i][1] = speed[i];
        }

        Arrays.sort(values, (a, b) -> b[0] - a[0]);

        for(int i = 0; i < position.length; i++){
            double currentValue = (double)(target - values[i][0]) / values[i][1];

            if(stack.isEmpty()){
                stack.push(currentValue);
                continue;
            }      

            if(!stack.isEmpty() && currentValue > stack.peek()){
                stack.push(currentValue);
            }
        }


        return stack.size();
    }
}
