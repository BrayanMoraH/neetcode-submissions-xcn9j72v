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
    int result = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return result;

        dfs(root);
        return result;
    }

    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }

        int resultLeft = dfs(root.left);
        int resultRight = dfs(root.right);

        result = Math.max(result, resultLeft + resultRight);

        return 1 + Math.max(resultLeft, resultRight);
    }
}
