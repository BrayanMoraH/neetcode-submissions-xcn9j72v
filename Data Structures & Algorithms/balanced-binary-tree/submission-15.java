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
        return validate(root)[0] == 1 ? true : false;
    }

    public int [] validate(TreeNode root){
        if(root == null){
            return new int [] {1, 0};
        }

        int [] left = validate(root.left);
        int [] right = validate(root.right);

        boolean isValid = (left[0] == 1 && right[0] == 1 && Math.abs(left[1] - right[1]) <= 1);

        int maxDepth = Math.max(left[1] , right[1]) + 1;

        return new int [] {isValid ? 1 : 0, maxDepth};
    }
}
