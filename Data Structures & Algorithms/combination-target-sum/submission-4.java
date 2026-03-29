class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(nums, target, 0, result, current);
        return result;
    }

    public void backtrack(int [] nums, int target, int index, List<List<Integer>> result, List<Integer> current){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }else if(target < 0 || index >= nums.length){
            return;
        }else {
            current.add(nums[index]);
            backtrack(nums, target - nums[index], index, result, current);

            current.remove(current.size() - 1);
            backtrack(nums, target, index + 1, result, current);
        }
    }
}
