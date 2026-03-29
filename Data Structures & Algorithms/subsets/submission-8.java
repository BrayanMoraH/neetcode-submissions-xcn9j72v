class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(nums, 0, current, result);
        return result;
    }

    public void backtrack(int[] nums, int i, List<Integer> current, List<List<Integer>> result){
        result.add(new ArrayList<>(current));

        for(int j = i; j < nums.length; j++){
            if(j > i && nums[j] == nums[j - 1]) continue;

            current.add(nums[j]);
            backtrack(nums, j + 1, current, result);
            current.remove(current.size() -1);
        }
    }
}
