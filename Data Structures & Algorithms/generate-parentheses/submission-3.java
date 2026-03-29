class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        combinations(n, new StringBuilder(), result, 0, 0);
        return result;
    }

    public static void combinations(int n, StringBuilder current, List<String> result, int open, int close){
        
        if(open == close && open == n){
            result.add(current.toString());
            return;
        }

        

        if(open < n){
            current.append('(');
            combinations(n, current, result, open + 1, close);
            current.deleteCharAt(current.length() - 1);
        }

        if(close < open){
            current.append(')');
            combinations(n, current, result, open, close + 1);
            current.deleteCharAt(current.length() - 1);
        }

    }
}
