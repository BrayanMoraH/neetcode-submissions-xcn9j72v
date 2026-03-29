class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        for(int number: nums){
            if(visited.contains(number)){
                return true;
            }

            visited.add(number);
        } 

        return false;
    }
}
