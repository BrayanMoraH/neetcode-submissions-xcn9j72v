class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, target, new ArrayList<>(), 0, nums);
        return result;

    }

    public void backtrack(List<List<Integer>> result, int target, List<Integer> current, int i, int[] nums){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0 || i >= nums.length){
            return;
        }

        current.add(nums[i]);
        backtrack(result, target - nums[i], current, i, nums);
        current.remove(current.size() - 1);
        backtrack(result, target, current, i + 1, nums);
    }
}
