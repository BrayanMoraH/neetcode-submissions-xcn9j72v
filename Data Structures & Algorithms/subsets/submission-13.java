class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(new ArrayList<>(), result, 0, nums);
        return result;
    }

    public void backtrack(List<Integer> current, List<List<Integer>> result, int i, int [] nums){
       if(i >= nums.length){
          result.add(new ArrayList<>(current));
          return;
       } 

       current.add(nums[i]);
       backtrack(current, result, i + 1, nums);
       current.remove(current.size() - 1);
       backtrack(current, result, i + 1, nums);
    }
}
