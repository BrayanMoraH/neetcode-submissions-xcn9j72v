class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        createSubsetsWithDup(0, new ArrayList<>(), result, nums);
        return result;

    }

    public void createSubsetsWithDup(int index, List<Integer> current, List<List<Integer>> result, int [] nums){
        result.add(new ArrayList<>(current));
        for(int i = index; i < nums.length; i++){
            if(i != index && nums[i] == nums[i - 1]) continue;

            current.add(nums[i]);
            createSubsetsWithDup(i + 1, current, result, nums);
            current.remove(current.size() - 1);
        }
    } 
}
