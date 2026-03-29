class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        createCombinationSum(nums, result, new ArrayList<>(), target, 0);
        return result;
    }

    public void createCombinationSum(int [] nums, List<List<Integer>> result, List<Integer> current, int target, int index){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = index; i < nums.length; i++){
            current.add(nums[i]);
            createCombinationSum(nums, result, current, target -  nums[i], i);
            current.remove(current.size() - 1);
        }
    }
}
