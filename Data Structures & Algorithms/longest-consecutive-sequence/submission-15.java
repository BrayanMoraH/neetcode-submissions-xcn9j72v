class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        int maxValue = 0;

        for(int current: nums){
            visited.add(current);
        }

        for(int current: visited){
            int sum = 1;

            if(!visited.contains(current -1)){
                int value = current + 1;

                while(visited.contains(value)){
                    sum++;
                    value++;
                }
            }

            maxValue = Math.max(maxValue, sum);
        }

        return maxValue;

    }
}
