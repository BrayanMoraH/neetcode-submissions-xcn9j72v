class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Stack<String> currentP = new Stack<>();
        backtrack(0, 0, currentP, result, n);
        return result;
    }

    public void backtrack(int openN, int closeN, Stack<String> currentP, List<String> result, int n){
        if(openN == closeN && openN == n){
            StringBuilder sb = new StringBuilder();
            for(String parenthesis: currentP){
                sb.append(parenthesis);
            }

            result.add(sb.toString());
            return;
        }

        if(openN < n){
            currentP.push("(");
            backtrack(openN + 1, closeN, currentP, result, n);
            currentP.pop();
        }

        if(closeN < openN){
            currentP.push(")");
            backtrack(openN, closeN + 1, currentP, result, n);
            currentP.pop();
        }
    }
}
