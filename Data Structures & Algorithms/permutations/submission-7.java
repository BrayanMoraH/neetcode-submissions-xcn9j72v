class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] isUsed = new boolean[nums.length];

        backtrack(nums, isUsed, current, result);

        return result;
    }

    public void backtrack(int[] nums, boolean[] isUsed, List<Integer> current, List<List<Integer>> result){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!isUsed[i]){
                isUsed[i] = true;
                current.add(nums[i]);
                backtrack(nums, isUsed, current, result);
                current.remove(current.size() - 1);
                isUsed[i] = false;
            }
        }
    }
}
