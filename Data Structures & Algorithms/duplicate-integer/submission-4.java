class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> noneDuplicates = new HashSet<>();
        for(int num: nums){
            if(noneDuplicates.contains(num)){
                return true;
            }

            noneDuplicates.add(num);
        }

        return false;
    }
}
