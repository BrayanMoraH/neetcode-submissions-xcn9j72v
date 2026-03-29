class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        combinations(n, 0, 0, result, "");
        return result;
    }

    public void combinations(int n, int open, int close, List<String> result, String current){
        if(open == n && close == open){
            result.add(current);
            return;
        }

        if(open < n){
            combinations(n, open + 1, close, result, current + "(");
        }

        if(close < open){
            combinations(n, open, close + 1, result, current + ")");
        }
    }
}
