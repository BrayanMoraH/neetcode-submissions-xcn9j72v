class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, target, 0, new ArrayList<>(), result);
        return result;
    }

    public void dfs(int[] nums, int target, int i, List<Integer> current, List<List<Integer>> result){

        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0 || i >= nums.length){
            return;
        }

        current.add(nums[i]);
        dfs(nums, target - nums[i], i, current, result);
        current.remove(current.size() - 1);
        dfs(nums, target, i + 1, current, result);
    }
}
