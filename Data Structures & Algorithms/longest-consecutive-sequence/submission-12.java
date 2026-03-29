class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        int total = 0;

        for(int num: nums){
            visited.add(num);
        }

        for(int current: visited){
            int sum = 1;
            
            if(!visited.contains(current - 1)){
                int value = current + 1;

                while(visited.contains(value)){
                    sum++;
                    value++;
                }
            }

            total = Math.max(sum, total);
        }

        return total;
    }
}
