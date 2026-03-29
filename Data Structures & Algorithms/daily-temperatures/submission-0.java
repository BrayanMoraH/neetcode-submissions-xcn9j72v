class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] result = new int [temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            int counter = 1;
            int current = temperatures[i];
            for(int j = i + 1; j < temperatures.length; j++){
                if(current < temperatures[j]){
                    result[i] = counter;
                    break;
                }

                counter++;
            }
        }

        return result;
    }
}
