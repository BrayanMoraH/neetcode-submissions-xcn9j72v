class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, new ArrayList<>(), result, 0);
        return result;
    }

    public void dfs(int [] nums, List<Integer> current, List<List<Integer>> result, int index){
        if(index >= nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        dfs(nums, current, result, index + 1);
        current.remove(current.size() - 1);
        dfs(nums, current, result, index + 1);
    }
}
