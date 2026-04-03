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
            isValid = isSameTree(root, subRoot);
        }

        boolean leftResult = isSubtree(root.left, subRoot);
        boolean rightResult = isSubtree(root.right, subRoot);

        if(isValid || leftResult || rightResult){
            return true;
        }

        return false;
    }

    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }

        if((p != null && q == null) || (p == null && q != null) || (p.val != q.val)){
            return false;
        }

        boolean leftResult = isSameTree(p.left, q.left);
        boolean rightResult = isSameTree(p.right, q.right);

        if(leftResult == false || rightResult == false){
            return false;
        }

        return true;
    }
}
