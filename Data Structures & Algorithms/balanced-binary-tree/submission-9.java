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
        int [] result = dfs(root);
        return result[0] == 1 ? true : false;
    }

    public int [] dfs(TreeNode root){
        if(root == null){
            return new int []{1, 0};
        }

        int [] resultLeft = dfs(root.left);
        int [] resultRight = dfs(root.right);

        boolean isBalanced = false;

        if(resultLeft[0] == 1 && resultRight[0] == 1 && Math.abs(resultLeft[1] - resultRight[1]) <= 1){
            isBalanced = true;
        }

        int maxDepth = Math.max(resultRight[1], resultLeft[1]) + 1;

        return new int [] {isBalanced ? 1 : 0, maxDepth};
    }
}
