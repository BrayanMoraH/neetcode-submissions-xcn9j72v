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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }

        boolean isValid = false;

        if(root.val == subRoot.val){
            isValid = dfs(root, subRoot);
        }

        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);

        if(left || right || isValid){
            return true;
        }

        return false;
    }

    public boolean dfs(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }

        if((root == null && subRoot != null) || (root != null && subRoot == null) || (root.val != subRoot.val)){
            return false;
        }

        boolean left = dfs(root.left, subRoot.left);
        boolean right = dfs(root.right, subRoot.right);

        if(left == false || right == false){
            return false;
        }

        return true;
    }
}
