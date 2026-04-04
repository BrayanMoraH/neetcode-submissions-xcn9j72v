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
        return count(root, root.val);
    }

    public int count(TreeNode root, int maxValue){
        if(root == null){
            return 0;
        }

        int result = (root.val >= maxValue) ? 1 : 0;
        maxValue = Math.max(maxValue, root.val);
        result += count(root.left, maxValue);
        result += count(root.right, maxValue);

        return result;
    }
}
