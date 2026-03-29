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
        int [] result = calculateBalance(root);
        return result[0] == 1 ? true : false; 
    }

    public int [] calculateBalance(TreeNode root){
        if(root == null) return new int []{1, 0};

        int [] left = calculateBalance(root.left);
        int [] right = calculateBalance(root.right);

        if(left[0] == 0 || right[0] == 0 || Math.abs(left[1] - right[1]) > 1){
            return new int []{0, Math.max(left[1], right[1]) + 1};
        }else {
            return new int [] {1, Math.max(left[1], right[1]) + 1};
        }

        //return new int [] {isBalance ? 1 : 0, Math.max(left[1], right[1]) + 1};
    }
}
