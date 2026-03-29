class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        createSum(candidates, target, new ArrayList<>(), result, 0);
        return result;

    }

    public void createSum(int [] candidates, int target, List<Integer> current, List<List<Integer>> result, int index){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = index; i < candidates.length; i++){
            if(i != index && candidates[i] == candidates[i - 1]) continue;

            current.add(candidates[i]);
            createSum(candidates, target - candidates[i], current, result, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
