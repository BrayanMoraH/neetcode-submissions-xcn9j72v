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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        inOrderTraverse(root, values);
        return values.get(k -1);
    }
    
    public void inOrderTraverse(TreeNode root, List<Integer> values){
        if(root == null){
            return;
        }

        inOrderTraverse(root.left, values);
        values.add(root.val);
        inOrderTraverse(root.right, values);
    }
}
