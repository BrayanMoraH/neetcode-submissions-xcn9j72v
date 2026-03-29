class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(target, 0, nums, result, new ArrayList<>());
        return result;
    }

    public void backtrack(int target, int index, int [] nums, List<List<Integer>> result, List<Integer> current){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0 || index >= nums.length){
            return;
        }

        current.add(nums[index]);
        backtrack(target - nums[index], index, nums, result, current);
        current.remove(current.size() - 1);
        backtrack(target, index + 1, nums, result, current);
    }
}
