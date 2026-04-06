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
        return calculateGoodNodes(root, root.val);
    }

    public int calculateGoodNodes(TreeNode root, int maxValue){
        if(root == null){
            return 0;
        }

        int result = (root.val >= maxValue) ? 1 : 0;

        maxValue = Math.max(maxValue, root.val);

        result += calculateGoodNodes(root.left, maxValue);
        result += calculateGoodNodes(root.right, maxValue);

        return result;
    }
}
