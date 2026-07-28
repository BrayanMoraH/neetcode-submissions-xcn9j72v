class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, target, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int i, int [] nums, int target, List<Integer> current, List<List<Integer>> result){

        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(i >= nums.length || target < 0){
            return;
        }

        current.add(nums[i]);
        backtrack(i, nums, target - nums[i], current, result);
        current.remove(current.size() - 1);
        backtrack(i + 1, nums, target, current, result);
    }
}
