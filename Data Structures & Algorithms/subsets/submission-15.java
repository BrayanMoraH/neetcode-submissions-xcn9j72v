class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, new ArrayList<>(), result, nums);
        return result;
    }

    public void backtrack(int i, List<Integer> current, List<List<Integer>> result, int [] nums){
        if(i >= nums.length){
            result.add(new ArrayList<>(current));
            return; 
        }

        current.add(nums[i]);
        backtrack(i + 1, current, result, nums);
        current.remove(current.size() -1);
        backtrack(i + 1, current, result, nums);
    }
}
