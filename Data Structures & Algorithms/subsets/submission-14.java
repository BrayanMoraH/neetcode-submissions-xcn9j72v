class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, 0, new ArrayList<>(), nums);
        return result;

    }

    public void backtrack(List<List<Integer>> result, int i, List<Integer> current, int [] nums){
        if(i >= nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        backtrack(result, i + 1, current, nums);
        current.remove(current.size() - 1);
        backtrack(result, i + 1, current, nums);
    }
}
