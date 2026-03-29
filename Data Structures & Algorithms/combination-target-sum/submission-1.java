class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSum(target, nums, new ArrayList<>(), result, 0);
        return result;

    }

    public void combinationSum(int target, int [] nums, List<Integer> current, List<List<Integer>> result, int index){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0) return;

        for(int i = index; i < nums.length; i++){
            current.add(nums[i]);
            combinationSum(target - nums[i], nums, current, result, i);
            current.remove(current.size() - 1);
        }
    }
}
