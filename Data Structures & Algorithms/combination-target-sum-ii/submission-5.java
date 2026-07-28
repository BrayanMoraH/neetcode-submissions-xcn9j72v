class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int i, int [] candidates, int target, List<Integer> current, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if( i >= candidates.length || target < 0){
            return;
        }

        for(int j = i; j < candidates.length; j++){
            if(j > i && candidates[j] == candidates[j - 1]){
                continue;
            }

            if(candidates[j] > target) break;

            current.add(candidates[j]);
            backtrack(j + 1, candidates, target - candidates[j], current, result);
            current.remove(current.size() - 1); 
        
        }
    }
}
