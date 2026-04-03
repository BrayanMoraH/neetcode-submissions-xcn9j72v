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
        int [] result = isValid(root);
        return result[0] == 1 ? true : false;
    }

    public int [] isValid(TreeNode root){
        if(root == null){
            return new int [] {1, 0};
        }

        int [] leftResult = isValid(root.left);
        int [] rightResult = isValid(root.right);

        boolean isCurrentValid = (leftResult[0] == 1 && rightResult[0] == 1 && Math.abs(leftResult[1] - rightResult[1]) <= 1);

        int maxDepth = Math.max(leftResult[1], rightResult[1]) + 1;


        return new int []{isCurrentValid ? 1 : 0, maxDepth};
    }
}
