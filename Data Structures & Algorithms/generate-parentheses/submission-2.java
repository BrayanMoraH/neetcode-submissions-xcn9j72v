class Solution {
    public List<String> generateParenthesis(int n) {
        Stack<String> stack = new Stack<>();
        List<String> result = new ArrayList<>();
        backtrack(n, 0, 0, result, stack);

        return result;
    }

    public void backtrack(int n, int openN, int closeN, List<String> result, Stack<String> stack){
        if(openN == closeN && openN == n){
            StringBuilder sb = new StringBuilder();
            for(String num: stack){
                sb.append(num);
            }

            result.add(sb.toString());

            return;
        }

        if(openN <= n){
            stack.push("(");
            backtrack(n, openN + 1, closeN, result, stack);
            stack.pop();
        }

        if(closeN < openN){
            stack.push(")");
            backtrack(n, openN, closeN + 1, result, stack);
            stack.pop();
        }
    }
}
