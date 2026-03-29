class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        bfs(0, new ArrayList<>(), result, nums);
        return result;
    }

    public void bfs(int index, List<Integer> current, List<List<Integer>> result, int [] nums){
        if(index >= nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        bfs(index + 1, current, result, nums);
        current.remove(current.size() - 1);
        bfs(index + 1, current, result, nums);
    }
}
