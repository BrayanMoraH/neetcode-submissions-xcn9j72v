class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for(int current: nums){
            if(seen.contains(current)){
                return true;  
            }

            seen.add(current);
        }

        return false;
    }
}