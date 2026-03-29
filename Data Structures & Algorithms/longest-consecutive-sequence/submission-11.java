class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> values = new HashSet<>();
        int maxValue = 0;

        for(int num: nums){
            values.add(num);
        }

        for(int num: values){
            int counter = 1;
            if(!values.contains(num - 1)){
                int current = num + 1;
                while(values.contains(current)){
                    counter++;
                    current++;
                }
            }

            maxValue = Math.max(counter, maxValue);
        }

        return maxValue;

    }
}
