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
    public int goodNodes(TreeNode root) {
        return validateNode(root, root.val);
    }

    public int validateNode(TreeNode root, int maxValue){
        if(root == null){
            return 0;
        }

        int result = (root.val >= maxValue) ? 1 : 0;
        maxValue = Math.max(root.val, maxValue);

        result += validateNode(root.left, maxValue);
        result += validateNode(root.right, maxValue);

        return result;
    }
}
