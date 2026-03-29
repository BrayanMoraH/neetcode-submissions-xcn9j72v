class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(target, candidates, 0, new ArrayList<>(), result);
        return result;

    }

    public void backtrack(int target, int [] candidates, int index, List<Integer> current, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = index; i < candidates.length; i++){
            if(i > index && candidates[i] == candidates[i - 1]) continue;

            current.add(candidates[i]);
            backtrack(target - candidates[i], candidates, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
