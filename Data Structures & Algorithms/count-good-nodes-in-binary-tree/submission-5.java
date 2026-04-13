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
        return countNode(root, root.val);
    }

    public int countNode(TreeNode root, int maxValue){
        if(root == null){
            return 0;
        }

        int res = (maxValue <= root.val) ? 1 : 0;
        maxValue = Math.max(root.val, maxValue);
        res += countNode(root.left, maxValue);
        res += countNode(root.right, maxValue);

        return res;
    }
}
