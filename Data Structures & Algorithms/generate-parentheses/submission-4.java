class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        combinations(n, 0, 0, "", result);
        return result;
    }

    public void combinations(int n, int open, int close, String current, List<String> result){
       if(open == n && open == close){
        result.add(current);
        return;
       } 

       if(open < n){
        combinations(n, open + 1, close, current + "(", result);
       }

       if(close < open){
        combinations(n, open, close + 1, current + ")", result);
       }

    }
}
