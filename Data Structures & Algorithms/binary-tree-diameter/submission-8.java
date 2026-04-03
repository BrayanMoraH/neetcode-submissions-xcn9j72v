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
    public int diameterOfBinaryTree(TreeNode root) {
        int [] result = new int [1];
        
        maxDepth(root, result);
        return result[0];
    }

    public int maxDepth(TreeNode root, int [] result){
        if(root == null){
            return 0;
        }

        int leftResult = maxDepth(root.left, result);
        int rightResult = maxDepth(root.right, result);

        result[0] = Math.max(result[0], leftResult + rightResult);

        return Math.max(leftResult, rightResult) + 1;
    }
}
