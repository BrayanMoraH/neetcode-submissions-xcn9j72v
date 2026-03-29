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
    int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return result;
    }

    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftValue = Math.max(dfs(root.left), 0);
        int rightValue = Math.max(dfs(root.right), 0);

        result = Math.max(result, leftValue + rightValue + root.val);

        return root.val + Math.max(leftValue, rightValue);
    }
}
