class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        for(int current: nums){
            if(visited.contains(current)) return true;
            visited.add(current);
        }

        return false;
    }
}
