class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        List<String> currentP = new ArrayList<>();
        backtrack(0, 0, currentP, result, n);
        return result;
    }

    public void backtrack(int openN, int closeN, List<String> currentP, List<String> result, int n){
        if(openN == closeN && openN == n){
            StringBuilder sb = new StringBuilder();
            for(String parenthesis: currentP){
                sb.append(parenthesis);
            }

            result.add(sb.toString());
            return;
        }

        if(openN < n){
            currentP.add("(");
            backtrack(openN + 1, closeN, currentP, result, n);
            currentP.remove(currentP.size() - 1);
        }

        if(closeN < openN){
            currentP.add(")");
            backtrack(openN, closeN + 1, currentP, result, n);
            currentP.remove(currentP.size() - 1);
        }
    }
}
