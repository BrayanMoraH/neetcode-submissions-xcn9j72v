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
    int kGlobal = 0;
    int result = 0;
    public int kthSmallest(TreeNode root, int k) {
        kGlobal = k;

        dfs(root);

        return result;
    }

    public void dfs(TreeNode root){
        if(root == null){
            return;
        }

        dfs(root.left);
        kGlobal -= 1;

        if(kGlobal == 0){
            result = root.val;
        }

        dfs(root.right);
    }
}
