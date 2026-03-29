class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       int [][] groups = new int [position.length][2];
       Stack<Double> stack = new Stack<>();

       for(int i = 0; i < position.length; i++){
        groups[i][0] = position[i];
        groups[i][1] = speed[i];
       }

       Arrays.sort(groups, (a, b) -> Integer.compare(b[0], a[0]));

       for(int i = 0; i < groups.length; i++){

        double result = (double)(target - groups[i][0]) / groups[i][1];

        if(stack.isEmpty()){
            stack.push(result);
            continue;
        }

        if(!stack.isEmpty() && result > stack.peek()){
            stack.push(result);
        }

       }

        return stack.size();
    }
}
