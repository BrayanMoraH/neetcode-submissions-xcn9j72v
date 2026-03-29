/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfs(root)[0] == 1;
    }

    public int [] dfs(TreeNode root){
        if(root == null){
            return new int []{1, 0};
        }

        int [] leftValue = dfs(root.left);
        int [] rightValue = dfs(root.right);

        boolean isValid = ((leftValue[0] == 1 && rightValue[0] == 1) && 
                                (Math.abs(leftValue[1] - rightValue[1]) <= 1));


        int height = 1 + Math.max(leftValue[1], rightValue[1]);

        return new int []{isValid ? 1 : 0, height};
    }
}
