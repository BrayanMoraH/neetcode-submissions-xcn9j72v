class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> indexes = new Stack<>();
        int [] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            if(indexes.isEmpty()){
                indexes.push(i);
                continue;
            }

            while(!indexes.isEmpty() && temperatures[i] > temperatures[indexes.peek()]){
                int index = indexes.pop();
                int distance = Math.abs(i - index);
                result[index] = distance;
            }

            indexes.push(i);
        }

        return result;
    }
}
