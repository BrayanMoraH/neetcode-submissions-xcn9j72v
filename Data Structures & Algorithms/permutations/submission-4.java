class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        cretePermutations(nums, result, new ArrayList<>(), new boolean [nums.length]);
        return result;
    }

    public void cretePermutations(int [] nums, List<List<Integer>> result, List<Integer> current, boolean [] used){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!used[i]){
                used[i] = true;
                current.add(nums[i]);
                cretePermutations(nums, result, current, used);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
}
